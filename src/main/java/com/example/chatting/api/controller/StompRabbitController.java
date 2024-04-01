package com.example.chatting.api.controller;

import com.example.chatting.api.service.ChatMessageService;
import com.example.chatting.domain.message.ChatMessage;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Slf4j
@RequiredArgsConstructor
@Controller
public class StompRabbitController {

    private final ChatMessageService chatMessageService;

    @MessageMapping("chat.enter.{chatRoomId}")
    public void enter(ChatMessage chat, @DestinationVariable String chatRoomId){
        chat.setMessage(chat.getNickname() + "님이 입장하셨습니다.");
        chatMessageService.sendMessage(chat);
    }

    @MessageMapping("chat.message.{chatRoomId}")
    public void send(ChatMessage chat, @DestinationVariable String chatRoomId){
        chatMessageService.sendMessage(chat);
    }

}