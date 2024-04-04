package com.example.chatting.domain.chatRoom;

import java.security.MessageDigest;
import java.util.UUID;

import com.example.chatting.api.dto.request.ChatRoomDTO.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class ChatRoom {

	@Id
	private String id;

	private String title;
	private String description;
	private String clientId;
	private String brokerId;

	@Builder
	public ChatRoom(String id, String title, String description, String clientId, String brokerId) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.clientId = clientId;
		this.brokerId = brokerId;
	}

	public static ChatRoom toEntity(ChatRoomRequestDTO dto) {
		return ChatRoom.builder()
				.id(UUID.randomUUID().toString())
				.title(dto.getTitle())
				.description(dto.getDescription())
				.clientId(dto.getClientId())
				.brokerId(dto.getBrokerId())
			.build();
	}

	public void updateTitle(String title) {
		this.title = title;
	}

	public void updateDescription(String description) {
		this.description = description;
	}
}
