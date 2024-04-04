package com.example.chatting.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.chatting.api.dto.request.ChatRoomDTO.*;
import com.example.chatting.domain.chatRoom.ChatRoom;
import com.example.chatting.domain.chatRoom.ChatRoomRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ChatRoomService {

	private final ChatRoomRepository chatRoomRepository;

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

}
