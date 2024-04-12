package com.example.chatting.api.controller;

import java.io.IOException;

import com.example.chatting.api.dto.SseEmitters;
import com.example.chatting.api.service.ChatMessageService;
import com.example.chatting.domain.message.ChatMessage;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@RequiredArgsConstructor
@Controller
public class StompRabbitMessageController {

    private final ChatMessageService chatMessageService;

    @MessageMapping("chat.enter.{chatRoomId}")
    public void enter(ChatMessage chat, @DestinationVariable String chatRoomId) throws IOException {
        chat.initChatMessageId(chat.getNickname() + "님이 입장하셨습니다.");
        chatMessageService.sendMessage(chat);
    }

    @MessageMapping("chat.message.{chatRoomId}")
    public void send(ChatMessage chat, @DestinationVariable String chatRoomId){
        chatMessageService.sendMessage(chat);
    }

}