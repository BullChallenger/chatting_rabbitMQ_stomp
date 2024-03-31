package com.example.chatting.domain.message;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatMongoRepository extends MongoRepository<ChatMessage, String> {
}
