package com.example.chatting.api.dto.request;

import java.util.List;

import com.example.chatting.domain.chatRoom.ChatRoom;
import com.example.chatting.domain.message.ChatMessage;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class ChatRoomDTO {

	@Getter
	@RequiredArgsConstructor
	public static class ChatRoomRequestDTO {
		private final String title;
		private final String description;
		private final String clientId;
		private final String brokerId;
	}

	@Getter
	public static class ChatRoomResponseDTO {
		private final String id;
		private final String title;
		private final String description;
		private final String clientId;
		private final String brokerId;
		private List<ChatMessage> chatMessagesInRoom;

		@Builder
		public ChatRoomResponseDTO(String id, String title, String description, String clientId, String brokerId) {
			this.id = id;
			this.title = title;
			this.description = description;
			this.clientId = clientId;
			this.brokerId = brokerId;
		}

		public static ChatRoomResponseDTO fromEntity(ChatRoom entity) {
			return ChatRoomResponseDTO.builder()
					.id(entity.getId())
					.title(entity.getTitle())
					.description(entity.getTitle())
					.clientId(entity.getClientId())
					.brokerId(entity.getBrokerId())
				.build();
		}

		public void setChatMessagesInRoom(List<ChatMessage> chatMessagesInRoom) {
			this.chatMessagesInRoom = chatMessagesInRoom;
		}

	}

}
