package com.example.chatting.api.service;

import com.example.chatting.domain.message.ChatMessage;
import com.example.chatting.domain.message.ChatMongoRepository;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class ChatService {

    private final RabbitTemplate rabbitTemplate;
    private final ChatMongoRepository chatMongoRepository;

    @Value("${rabbitmq.exchange.name}")
    private String EXCHANGE_NAME;

    public void sendMessage(ChatMessage message) {
        log.info("message sent: {}", message.toString());
        rabbitTemplate.convertAndSend(EXCHANGE_NAME, "room." + message.getChatRoomId(), message);
    }

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void receiveMessage(ChatMessage message) {
        message.setId(UUID.randomUUID().toString());
        chatMongoRepository.save(message);
        log.info("Received message: {}", message);
    }

}
