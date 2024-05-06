package com.example.chatting.api.dto;

import java.util.List;

import com.example.chatting.domain.chatRoom.ChatRoom;
import com.example.chatting.domain.message.ChatMessage;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ChatRoomDTO {
	
	@Getter
	public static class ChatRoomRequestDTO {
		private final String title;
		private final String description;
		private final String clientId;
		private final String agentId;

		@Builder
		public ChatRoomRequestDTO(String title, String description, String clientId, String brokerId) {
            this.title = title;
            this.description = description;
            this.clientId = clientId;
			this.agentId = brokerId;
		}
	}

	@Getter
	public static class ChatRoomResponseDTO {
		private final String id;
		private final String title;
		private final String description;
		private final String clientId;
		private final String agentId;
		private String recentMessage;
		private List<ChatMessage> chatMessagesInRoom;

		@Builder
		public ChatRoomResponseDTO(String id, String title, String description, String clientId, String agentId,
                                   String recentMessage) {
			this.id = id;
            this.title = title;
            this.description = description;
            this.recentMessage = recentMessage;
			this.clientId = clientId;
			this.agentId = agentId;
		}

		public static ChatRoomResponseDTO fromEntity(ChatRoom entity) {
			return ChatRoomResponseDTO.builder()
					.id(entity.getId())
					.title(entity.getTitle())
					.description(entity.getDescription())
					.clientId(entity.getClientId())
					.agentId(entity.getAgentId())
					.build();
		}

		public void setChatMessagesInRoom(List<ChatMessage> chatMessagesInRoom) {
			this.chatMessagesInRoom = chatMessagesInRoom;
		}
	}

	@Getter
	public static class ChatRoomListResponseDTO {
		private final String id;
		private final String title;
		private final String description;
		private final String clientId;
		private final String agentId;
		private String recentMessage;

		@Builder
		public ChatRoomListResponseDTO(String id, String title, String description, String clientId, String agentId,
								   String recentMessage) {
			this.id = id;
			this.title = title;
			this.description = description;
			this.recentMessage = recentMessage;
			this.clientId = clientId;
			this.agentId = agentId;
		}

		public static ChatRoomListResponseDTO fromEntity(ChatRoom entity) {
			return ChatRoomListResponseDTO.builder()
					.id(entity.getId())
					.title(entity.getTitle())
					.description(entity.getDescription())
					.clientId(entity.getClientId())
					.agentId(entity.getAgentId())
					.build();
		}

		public void setRecentMessage(String recentMessage) {
			this.recentMessage = recentMessage;
		}

	}

}
