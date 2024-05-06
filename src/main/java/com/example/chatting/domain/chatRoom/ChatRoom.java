package com.example.chatting.domain.chatRoom;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;

import com.example.chatting.api.dto.ChatRoomDTO.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class ChatRoom {

	@Id
	private String id;

	private String title;
	private String description;
	private String clientId;
	private String agentId;

	@CreatedDate
	private LocalDateTime createdAt;

	@Builder
	public ChatRoom(String id, String title, String description, String clientId, String agentId) {
		this.id = id;
        this.title = title;
        this.description = description;
        this.clientId = clientId;
		this.agentId = agentId;
	}

	public static ChatRoom toEntity(ChatRoomRequestDTO request) {
		return ChatRoom.builder()
				.id(UUID.randomUUID().toString())
				.title(request.getTitle())
				.description(request.getDescription())
				.clientId(request.getClientId())
				.agentId(request.getAgentId())
			.build();
	}

}
