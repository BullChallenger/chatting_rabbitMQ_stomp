package com.example.chatting.domain.chatRoom;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, String> {

	boolean existsByAgentIdAndClientId(String brokerId, String clientId);
	List<ChatRoom> findAllByAgentId(String agentId);
	List<ChatRoom> findAllByClientId(String clientId);

    List<ChatRoom> findAllByAgentIdOrClientId(String agentId, String clientId);
}
