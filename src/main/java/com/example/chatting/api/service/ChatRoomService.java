package com.example.chatting.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.devh.boot.grpc.client.inject.GrpcClient;

import com.example.chatting.api.dto.ChatRoomDTO.*;
import com.example.chatting.api.dto.ContractDTO.*;
import com.example.chatting.domain.chatRoom.ChatRoom;
import com.example.chatting.domain.chatRoom.ChatRoomRepository;
import com.example.grpc.contract.ContractGrpcServiceGrpc;
import com.example.grpc.contract.MakeContractRequest;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ChatRoomService {

	private final ChatRoomRepository chatRoomRepository;

	@GrpcClient(value = "contract-server")
	private ContractGrpcServiceGrpc.ContractGrpcServiceBlockingStub contractGrpcServiceBlockingStub;

	public ChatRoomResponseDTO create(ChatRoomRequestDTO request) {
		return ChatRoomResponseDTO.fromEntity(chatRoomRepository.save(ChatRoom.toEntity(request)));
	}

	public ChatRoomResponseDTO findBy(String chatRoomId) {
		ChatRoom chatRoom = chatRoomRepository.findById(chatRoomId).orElseThrow(EntityNotFoundException::new);
		return ChatRoomResponseDTO.fromEntity(chatRoom);
	}

	public List<ChatRoomResponseDTO> findAllBy(String brokerId) {
		return chatRoomRepository.findAllByBrokerId(brokerId)
			.stream()
			.map(ChatRoomResponseDTO::fromEntity)
			.toList();
	}

	public UpdateChatRoomResponseDTO update(UpdateChatRoomRequestDTO request) {
		ChatRoom chatRoom = chatRoomRepository.findById(request.getChatRoomId()).orElseThrow(EntityNotFoundException::new);

		if (!chatRoom.getTitle().equals(request.getTitle())) {
			chatRoom.updateTitle(request.getTitle());
		}

		if (!chatRoom.getDescription().equals(request.getDescription())) {
			chatRoom.updateDescription(request.getDescription());
		}

		return UpdateChatRoomResponseDTO.fromEntity(chatRoom);
	}

	public String deleteBy(String chatRoomId) {
		chatRoomRepository.deleteById(chatRoomId);
		return "채팅방이 성공적으로 삭제됐습니다.";
	}

	public MakeContractResponseDTO makeContract(MakeContractRequestDTO request) {
		MakeContractRequest makeContractRequest = MakeContractRequest.newBuilder()
			.setClientId(request.getClientId())
			.setAgentId(request.getAgentId())
			.build();

		return new MakeContractResponseDTO(contractGrpcServiceBlockingStub
			.makeContractForParticipants(makeContractRequest).getContractId()
		);
	}
}
