package com.example.chatting.domain.chatRoom;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, String> {

	List<ChatRoom> findAllByBrokerId(String brokerId);

}
