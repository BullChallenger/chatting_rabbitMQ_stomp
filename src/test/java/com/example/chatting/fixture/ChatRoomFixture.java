package com.example.chatting.fixture;

import java.util.UUID;

import com.example.chatting.api.dto.request.ChatRoomDTO;
import com.example.chatting.domain.chatRoom.ChatRoom;

public class ChatRoomFixture {

	public static ChatRoom createEntity() {
		return ChatRoom.builder()
			.id(UUID.randomUUID().toString())
			.title("Fixture Title")
			.description("Fixture Description")
			.clientId("Fixture ClientId")
			.brokerId("Fixture BrokerId")
			.build();
	}

	public static ChatRoomDTO.ChatRoomRequestDTO createRequestDTO() {
		return ChatRoomDTO.ChatRoomRequestDTO.builder()
				.title("Fixture Title")
				.description("Fixture Description")
				.clientId("Fixture ClientId")
				.brokerId("Fixture BrokerId")
			.build();
	}

}
