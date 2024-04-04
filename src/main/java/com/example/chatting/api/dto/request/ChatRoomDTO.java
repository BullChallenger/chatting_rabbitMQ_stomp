package com.example.chatting.api.dto.request;

import java.util.Arrays;
import java.util.List;

import com.example.chatting.domain.chatRoom.ChatRoom;
import com.example.chatting.domain.message.ChatMessage;

import lombok.Builder;
import lombok.Getter;

public class ChatRoomDTO {

	@Getter
	public static class ChatRoomRequestDTO {
		private final String title;
		private final String description;
		private final String clientId;
		private final String brokerId;

		@Builder
		public ChatRoomRequestDTO(String title, String description, String clientId, String brokerId) {
			this.title = title;
			this.description = description;
			this.clientId = clientId;
			this.brokerId = brokerId;
		}
	}

	@Getter
	public static class UpdateChatRoomRequestDTO {
		private final String chatRoomId;
		private final String title;
		private final String description;

		@Builder
		public UpdateChatRoomRequestDTO(String chatRoomId, String title, String description) {
			this.chatRoomId = chatRoomId;
			this.title = title;
			this.description = description;
		}
	}

	@Getter
	public static class ChatRoomResponseDTO {
		private final String id;
		private final String title;
		private final String description;
		private final List<String> participantIds;
		private final String clientId;
		private final String brokerId;
		private List<ChatMessage> chatMessagesInRoom;

		@Builder
		public ChatRoomResponseDTO(String id, String title, String description, String clientId, String brokerId) {
			this.id = id;
			this.title = title;
			this.description = description;
			this.participantIds = Arrays.asList(clientId, brokerId);
			this.clientId = clientId;
			this.brokerId = brokerId;
		}

		public static ChatRoomResponseDTO fromEntity(ChatRoom entity) {
			return ChatRoomResponseDTO.builder()
					.id(entity.getId())
					.title(entity.getTitle())
					.description(entity.getDescription())
					.clientId(entity.getClientId())
					.brokerId(entity.getBrokerId())
				.build();
		}

		public void setChatMessagesInRoom(List<ChatMessage> chatMessagesInRoom) {
			this.chatMessagesInRoom = chatMessagesInRoom;
		}
	}

	@Getter
	public static class UpdateChatRoomResponseDTO {
		private final String title;
		private final String description;

		@Builder
		public UpdateChatRoomResponseDTO(String title, String description) {
			this.title = title;
			this.description = description;
		}

		public static UpdateChatRoomResponseDTO fromEntity(ChatRoom entity) {
			return UpdateChatRoomResponseDTO.builder()
				.title(entity.getTitle())
				.description(entity.getDescription())
				.build();
		}
	}

}
