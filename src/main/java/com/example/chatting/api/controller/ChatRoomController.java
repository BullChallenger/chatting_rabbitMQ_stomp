package com.example.chatting.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.chatting.api.dto.request.ChatRoomDTO.*;
import com.example.chatting.api.service.ChatMessageService;
import com.example.chatting.api.service.ChatRoomService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(value = "/chat")
@Controller
public class ChatRoomController {

    private final ChatRoomService chatRoomService;
    private final ChatMessageService chatMessageService;

    @GetMapping(value = "/room/create")
    public String createPage() {
        return "createRoom";
    }

    @PostMapping(value = "/room")
    public ResponseEntity<ChatRoomResponseDTO> create(@RequestBody ChatRoomRequestDTO request) {
        return ResponseEntity.ok(chatRoomService.create(request));
    }

    @GetMapping(value = "/{brokerId}/room")
    public String findAllBy(@PathVariable(value = "brokerId") String brokerId, Model model) {
        List<ChatRoomResponseDTO> chatRooms = chatRoomService.findAllBy(brokerId);
        model.addAttribute("chatRooms", chatRooms);
        return "roomList";
    }

    @GetMapping(value = "/room")
    public String enterNewRoom(String chatRoomId, String nickname, Model model){
        ChatRoomResponseDTO chatRoom = chatRoomService.findBy(chatRoomId);
        chatRoom.setChatMessagesInRoom(chatMessageService.findAllChatMessageBy(chatRoomId));

        model.addAttribute("chatRoomId", chatRoom.getId());
        model.addAttribute("nickname", nickname);
        model.addAttribute("chatMessages", chatRoom.getChatMessagesInRoom());

        return "room";
    }

}
