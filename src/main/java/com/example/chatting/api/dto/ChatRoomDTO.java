package com.example.chatting.api.dto;

import java.util.Arrays;
import java.util.List;

import com.example.chatting.domain.chatRoom.ChatRoom;
import com.example.chatting.domain.message.ChatMessage;

import lombok.Builder;
import lombok.Getter;

public class ChatRoomDTO {

	@Getter
	public static class ChatRoomRequestDTO {
		private final String clientId;
		private final String brokerId;

		@Builder
		public ChatRoomRequestDTO(String clientId, String brokerId) {
			this.clientId = clientId;
			this.brokerId = brokerId;
		}
	}

	@Getter
	public static class ChatRoomResponseDTO {
		private final String id;
		private final String nickname;
		private final List<String> participantIds;
		private final String clientId;
		private final String brokerId;
		private String recentMessage;
		private List<ChatMessage> chatMessagesInRoom;

		@Builder
		public ChatRoomResponseDTO(String id, String nickname, String clientId, String brokerId,
			String recentMessage) {
			this.id = id;
			this.nickname = nickname;
			this.recentMessage = recentMessage;
			this.participantIds = Arrays.asList(clientId, brokerId);
			this.clientId = clientId;
			this.brokerId = brokerId;
		}

		public static ChatRoomResponseDTO fromEntity(ChatRoom entity) {
			return ChatRoomResponseDTO.builder()
					.id(entity.getId())
					.nickname("집 구하는 노숙자")
					.clientId(entity.getClientId())
					.brokerId(entity.getAgentId())
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
		private final String nickname;
		private final List<String> participantIds;
		private final String clientId;
		private final String brokerId;
		private String recentMessage;

		@Builder
		public ChatRoomListResponseDTO(String id, String title, String description, String nickname, String clientId, String brokerId,
								   String recentMessage) {
			this.id = id;
			this.title = title;
			this.description = description;
			this.nickname = nickname;
			this.recentMessage = recentMessage;
			this.participantIds = Arrays.asList(clientId, brokerId);
			this.clientId = clientId;
			this.brokerId = brokerId;
		}

		public static ChatRoomListResponseDTO fromEntity(ChatRoom entity) {
			return ChatRoomListResponseDTO.builder()
					.id(entity.getId())
					.title("테스트")
					.description("임시로 만든 채팅창임")
					.nickname("집 구하는 노숙자")
					.clientId(entity.getClientId())
					.brokerId(entity.getAgentId())
					.build();
		}

		public void setRecentMessage(String recentMessage) {
			this.recentMessage = recentMessage;
		}

	}

}
