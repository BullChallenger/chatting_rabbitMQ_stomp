package com.example.chatting.api.controller;

import com.example.chatting.api.service.ChatService;
import com.example.chatting.domain.message.ChatMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/chat")
@RestController
public class ChatController {

    private final ChatService chatService;

    @RequestMapping(value = "/send/message", method = RequestMethod.POST)
    public ResponseEntity<?> sendMessage(@RequestBody ChatMessage message) {
        chatService.sendMessage(message);
        return ResponseEntity.ok("Message sent to RabbitMQ!");
    }

}
