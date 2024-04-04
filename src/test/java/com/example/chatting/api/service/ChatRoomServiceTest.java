package com.example.chatting.api.service;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.chatting.api.dto.request.ChatRoomDTO.*;
import com.example.chatting.domain.chatRoom.ChatRoom;
import com.example.chatting.domain.chatRoom.ChatRoomRepository;
import com.example.chatting.fixture.ChatRoomFixture;

@ExtendWith(MockitoExtension.class)
class ChatRoomServiceTest {

	@Mock
	private ChatRoomRepository chatRoomRepository;

	@InjectMocks
	private ChatRoomService chatRoomService;

	@DisplayName("채팅방_생성_테스트_성공")
	@Test
	void createRoomTest() {
		// given
		ChatRoomRequestDTO fixtureDTO = ChatRoomFixture.createRequestDTO();
		Mockito.when(chatRoomRepository.save(any(ChatRoom.class))).thenReturn(ChatRoomFixture.createEntity());

		// when
		ChatRoomResponseDTO responseDTO = chatRoomService.create(fixtureDTO);

		// then
		assertThat(responseDTO.getTitle()).isEqualTo(fixtureDTO.getTitle());
		assertThat(responseDTO.getDescription()).isEqualTo(fixtureDTO.getDescription());
		assertThat(responseDTO.getBrokerId()).isEqualTo(fixtureDTO.getBrokerId());
		assertThat(responseDTO.getClientId()).isEqualTo(fixtureDTO.getClientId());
	}

	@DisplayName("채팅방_조회_테스트_성공")
	@Test
	void findChatRoomById() {
		// given
		ChatRoom fixtureEntity = ChatRoomFixture.createEntity();
		Mockito.when(chatRoomRepository.findById(anyString())).thenReturn(
			Optional.of(fixtureEntity)
		);

		// when
		ChatRoomResponseDTO responseDTO = chatRoomService.findBy("mockChatRoomId");

		// then
		assertThat(responseDTO.getId()).isEqualTo(fixtureEntity.getId());
		assertThat(responseDTO.getTitle()).isEqualTo(fixtureEntity.getTitle());
		assertThat(responseDTO.getDescription()).isEqualTo(fixtureEntity.getDescription());
		assertThat(responseDTO.getBrokerId()).isEqualTo(fixtureEntity.getBrokerId());
		assertThat(responseDTO.getClientId()).isEqualTo(fixtureEntity.getClientId());
	}

}