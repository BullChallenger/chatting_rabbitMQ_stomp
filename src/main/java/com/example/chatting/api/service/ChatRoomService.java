package com.example.chatting.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.chatting.api.dto.ChatRoomDTO.*;
import com.example.chatting.domain.chatRoom.ChatRoom;
import com.example.chatting.domain.chatRoom.ChatRoomRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ChatRoomService {

	private final ChatRoomRepository chatRoomRepository;

	public ChatRoomResponseDTO findBy(String chatRoomId) {
		ChatRoom chatRoom = chatRoomRepository.findById(chatRoomId).orElseThrow(EntityNotFoundException::new);
		return ChatRoomResponseDTO.fromEntity(chatRoom);
	}

	public List<ChatRoomListResponseDTO> findAllBy(String accountId) {
		return chatRoomRepository.findAllByAgentIdOrClientId(accountId, accountId)
			.stream()
			.map(ChatRoomListResponseDTO::fromEntity)
		.toList();
	}

	public List<ChatRoomListResponseDTO> findAllByAgentId(String agentId) {
		return chatRoomRepository.findAllByAgentId(agentId)
			.stream()
			.map(ChatRoomListResponseDTO::fromEntity)
		.toList();
	}

	public List<ChatRoomListResponseDTO> findAllByClientId(String clientId) {
		return chatRoomRepository.findAllByClientId(clientId)
			.stream()
			.map(ChatRoomListResponseDTO::fromEntity)

		.toList();
	}

	public String deleteBy(String chatRoomId) {
		chatRoomRepository.deleteById(chatRoomId);
		return "채팅방이 성공적으로 삭제됐습니다.";
	}

}
