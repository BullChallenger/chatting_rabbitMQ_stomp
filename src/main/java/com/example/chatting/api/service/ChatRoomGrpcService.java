package com.example.chatting.api.service;

import java.util.List;
import java.util.function.Function;

import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;

import com.example.chatting.domain.chatRoom.ChatRoom;
import com.example.chatting.domain.chatRoom.ChatRoomRepository;
import com.example.chatting.domain.message.ChatMessageRepository;
import com.example.grpc.account.AccountServiceGrpc;
import com.example.grpc.account.GetAccountReq;
import com.example.grpc.chat.AgentIdRequest;
import com.example.grpc.chat.ChatMessage;
import com.example.grpc.chat.ChatRoomGrpcServiceGrpc;
import com.example.grpc.chat.ChatRoomIdRequest;
import com.example.grpc.chat.ChatRoomInfoResponse;
import com.example.grpc.chat.ChatRoomListResponse;
import com.example.grpc.chat.ChatRoomRequest;
import com.example.grpc.chat.ChatRoomResponse;
import com.example.grpc.chat.ChatRoomValidationResult;
import com.example.grpc.chat.ClientIdRequest;
import com.example.grpc.chat.ExitChatRoomResponse;

import io.grpc.stub.StreamObserver;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@GrpcService
public class ChatRoomGrpcService extends ChatRoomGrpcServiceGrpc.ChatRoomGrpcServiceImplBase {

	private final ChatRoomRepository chatRoomRepository;
	private final ChatMessageRepository chatMessageRepository;

	@GrpcClient(value = "account-server")
	private AccountServiceGrpc.AccountServiceBlockingStub accountServiceBlockingStub;

	@Override
	public void createChatRoom(ChatRoomRequest request, StreamObserver<ChatRoomResponse> responseObserver) {
		if (!isExists(request)) {
			ChatRoom chatRoom = chatRoomRepository.save(ChatRoom.toEntity(request));
			responseObserver.onNext(ChatRoomResponse.newBuilder().setId(chatRoom.getId()).build());
			responseObserver.onCompleted();
			return;
		}

		// TODO: 예외처리
		throw new IllegalArgumentException("해당 사용자와의 채팅방이 이미 존재합니다.");
	}

	@Override
	public void enterChatRoom(ChatRoomIdRequest request, StreamObserver<ChatRoomResponse> responseObserver) {
		String chatRoomId = request.getChatRoomId();
		ChatRoom chatRoom = chatRoomRepository.findById(chatRoomId).orElseThrow(EntityNotFoundException::new);

		responseObserver.onNext(ChatRoomResponse.newBuilder()
			.setId(chatRoomId)
			.setClientId(chatRoom.getClientId())
			.setAgentId(chatRoom.getAgentId())
			.addAllChatMessagesInRoom(convertToGrpc(chatMessageRepository.findAllByChatRoomId(chatRoomId)))
			.build()
		);
		responseObserver.onCompleted();
	}

	@Override
	public void findAllByAgentId(AgentIdRequest request, StreamObserver<ChatRoomListResponse> responseObserver) {
		List<ChatRoom> allByAgentId = chatRoomRepository.findAllByAgentId(request.getAgentId());

		responseObserver.onNext(ChatRoomListResponse.newBuilder().addAllChatRooms(getClientNicknameFromAccountServer(allByAgentId)).build());
		responseObserver.onCompleted();
	}

//	@Override
//	public void findAllByClientId(ClientIdRequest request, StreamObserver<ChatRoomListResponse> responseObserver) {
//		List<ChatRoom> allByClientId = chatRoomRepository.findAllByClientId(request.getClientId());
//
//		responseObserver.onNext(ChatRoomListResponse.newBuilder().addAllChatRooms(getAgentNicknameFromAccountServer(allByClientId)).build());
//		responseObserver.onCompleted();
//	}

	@Override
	public void exitChatRoom(ChatRoomIdRequest request, StreamObserver<ExitChatRoomResponse> responseObserver) {
		if (isExistsById(request)) {
			responseObserver.onNext(ExitChatRoomResponse.newBuilder().setMessage("채팅방을 나왔습니다.").build());
			responseObserver.onCompleted();
			return;
		}

		// TODO: 예외처리
		throw new EntityNotFoundException("해당 채팅방이 존재하지 않습니다.");
	}

	@Override
	public void isChatRoomOpened(ChatRoomRequest request, StreamObserver<ChatRoomValidationResult> responseObserver) {
		if (isExists(request)) {
			responseObserver.onNext(ChatRoomValidationResult.newBuilder().setResult(true).build());
			responseObserver.onCompleted();
			return;
		}

		responseObserver.onNext(ChatRoomValidationResult.newBuilder().setResult(false).build());
		responseObserver.onCompleted();
	}

	private boolean isExists(ChatRoomRequest request) {
		return chatRoomRepository.existsByAgentIdAndClientId(request.getAgentId(), request.getClientId());
	}

	private boolean isExistsById(ChatRoomIdRequest request) {
		return chatRoomRepository.existsById(request.getChatRoomId());
	}

	private String getNicknameFromAccountServer(String accountId) {
		return accountServiceBlockingStub.getAccount(
			GetAccountReq.newBuilder().setAccountId(accountId).build()
		).getAccount().getNickname();
	}

	private List<ChatRoomInfoResponse> getNicknameFromAccountServer(List<ChatRoom> chatRooms, Function<ChatRoom, String> idExtractor) {
		return chatRooms.stream()
			.map(chatRoom -> {
				String nickname = getNicknameFromAccountServer(idExtractor.apply(chatRoom));

				return ChatRoomInfoResponse.newBuilder()
					.setId(chatRoom.getId())
					.setNickname(nickname)
					.setCreatedAt(String.valueOf(chatRoom.getCreatedAt()))
					.build();
			})
			.toList();
	}

	private List<ChatRoomInfoResponse> getClientNicknameFromAccountServer(List<ChatRoom> chatRooms) {
		return getNicknameFromAccountServer(chatRooms, ChatRoom::getClientId);
	}

	private List<ChatRoomInfoResponse> getAgentNicknameFromAccountServer(List<ChatRoom> chatRooms) {
		return getNicknameFromAccountServer(chatRooms, ChatRoom::getAgentId);
	}

	private List<ChatMessage> convertToGrpc(List<com.example.chatting.domain.message.ChatMessage> chatMessages) {
		return chatMessages.stream().map(
			chatMessage -> ChatMessage.newBuilder()
				.setId(chatMessage.getId())
				.setChatRoomId(chatMessage.getChatRoomId())
				.setAccountId(chatMessage.getAccountId())
				.setNickname(chatMessage.getNickname())
				.setMessage(chatMessage.getMessage())
				.build()
		).toList();
	}

}
