package com.example.chatting.api.service;

import com.example.chatting.domain.message.ChatMessage;
import com.example.chatting.domain.message.ChatMessageRepository;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class ChatMessageService {

    private final RabbitTemplate rabbitTemplate;
    private final ChatMessageRepository chatMessageRepository;

    @Value("${rabbitmq.exchange.name}")
    private String EXCHANGE_NAME;

    public void sendMessage(ChatMessage message) {
        log.info("message sent: {}", message.toString());
        rabbitTemplate.convertAndSend(EXCHANGE_NAME, "room." + message.getChatRoomId(), message);
    }

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void receiveMessage(ChatMessage message) {
        message.setId(UUID.randomUUID().toString());
        log.info("Received message: {}", chatMessageRepository.save(message));
    }

    public List<ChatMessage> findAllChatMessageBy(String chatRoomId) {
        return chatMessageRepository.findAllByChatRoomId(chatRoomId);
    }

}
