package com.example.chatting.api.service;

import net.devh.boot.grpc.server.service.GrpcService;

import com.example.chatting.domain.chatRoom.ChatRoomRepository;
import com.example.grpc.chat.ChatRoomGrpcServiceGrpc;
import com.example.grpc.chat.ChatRoomValidationResult;
import com.example.grpc.chat.ValidateChatRoomOpenRequest;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@GrpcService
public class ChatRoomGrpcService extends ChatRoomGrpcServiceGrpc.ChatRoomGrpcServiceImplBase {

	private final ChatRoomRepository chatRoomRepository;

	@Override
	public void isChatRoomOpened(ValidateChatRoomOpenRequest request, StreamObserver<ChatRoomValidationResult> responseObserver) {
		boolean isExists = chatRoomRepository.existsByBrokerIdAndClientId(request.getAgentId(), request.getClientId());
		if (isExists) {
			responseObserver.onNext(ChatRoomValidationResult.newBuilder().setResult(true).build());
			responseObserver.onCompleted();
			return;
		}

		responseObserver.onNext(ChatRoomValidationResult.newBuilder().setResult(false).build());
		responseObserver.onCompleted();
	}

}
