package com.example.chatting.domain.chatRoom;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, String> {

	boolean existsByBrokerIdAndClientId(String brokerId, String clientId);
	List<ChatRoom> findAllByBrokerId(String brokerId);

}
