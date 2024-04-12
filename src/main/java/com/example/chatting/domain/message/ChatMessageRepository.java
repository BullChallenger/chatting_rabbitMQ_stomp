package com.example.chatting.domain.message;

import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatMessageRepository extends MongoRepository<ChatMessage, String> {

	List<ChatMessage> findAllByChatRoomId(String chatRoomId);

	@Aggregation(pipeline = {
		"{ '$match': { 'chatRoomId' : ?0 } }",
		"{ '$sort' : { 'createdAt' : -1 } }",
		"{ '$limit' : 1 }",
		"{ '$project' : { 'message': 1, '_id': 0 } }"
	})
	String findLatestMessageInChatRoom(String chatRoomId);

}
