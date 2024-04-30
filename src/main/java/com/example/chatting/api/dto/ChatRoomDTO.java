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
		private String clientId;
		private String agentId;

		public ChatRoomRequestDTO() {
			
		}

		@Builder
		public ChatRoomRequestDTO(String clientId, String agentId) {
			this.clientId = clientId;
			this.agentId = agentId;
		}
	}

	@Getter
	public static class ChatRoomResponseDTO {
		private final String id;
		private final String nickname;
		private final String clientId;
		private final String agentId;
		private String recentMessage;
		private List<ChatMessage> chatMessagesInRoom;

		@Builder
		public ChatRoomResponseDTO(String id, String nickname, String clientId, String agentId, String recentMessage) {
			this.id = id;
			this.nickname = nickname;
			this.recentMessage = recentMessage;
			this.clientId = clientId;
			this.agentId = agentId;
		}

		public static ChatRoomResponseDTO fromEntity(ChatRoom entity) {
			return ChatRoomResponseDTO.builder()
					.id(entity.getId())
					.nickname("집 구하는 노숙자")
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
		private final String nickname;
		private final String clientId;
		private final String agentId;
		private String recentMessage;

		@Builder
		public ChatRoomListResponseDTO(String id, String nickname, String clientId, String agentId, String recentMessage) {
			this.id = id;
			this.nickname = nickname;
			this.recentMessage = recentMessage;
			this.clientId = clientId;
			this.agentId = agentId;
		}

		public static ChatRoomListResponseDTO fromEntity(ChatRoom entity, String otherAccountNickname) {
			return ChatRoomListResponseDTO.builder()
					.id(entity.getId())
					.nickname(otherAccountNickname)
					.clientId(entity.getClientId())
					.agentId(entity.getAgentId())
					.build();
		}

		public static ChatRoomListResponseDTO fromEntity(ChatRoom entity) {
			return ChatRoomListResponseDTO.builder()
					.id(entity.getId())
					.nickname("집 구하는 노숙자")
					.clientId(entity.getClientId())
					.agentId(entity.getAgentId())
					.build();
		}

		public void setRecentMessage(String recentMessage) {
			this.recentMessage = recentMessage;
		}

	}

}
