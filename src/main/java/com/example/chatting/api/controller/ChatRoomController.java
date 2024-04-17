package com.example.chatting.api.controller;

import java.util.List;
import java.util.UUID;

import com.example.chatting.api.dto.ChatRoomDTO;
import com.example.chatting.domain.chatRoom.ChatRoom;
import com.example.chatting.domain.chatRoom.ChatRoomRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.chatting.api.dto.ChatRoomDTO.*;
import com.example.chatting.api.service.ChatMessageService;
import com.example.chatting.api.service.ChatRoomService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(value = "/chat")
@Controller
public class ChatRoomController {

    private final ChatRoomService chatRoomService;
    private final ChatMessageService chatMessageService;
    private final ChatRoomRepository chatRoomRepository;

    @PostMapping(value = "/create")
    public ResponseEntity<ChatRoom> create(@RequestBody ChatRoomDTO.ChatRoomRequestDTO dto) {
        ChatRoom build = ChatRoom.builder().id(UUID.randomUUID().toString()).clientId(dto.getClientId()).agentId(dto.getBrokerId()).build();
        return ResponseEntity.ok(chatRoomRepository.save(build));
    }

    @GetMapping(value = "/{brokerId}/room")
    public String findAllBy(@PathVariable(value = "brokerId") String brokerId, Model model) {
        List<ChatRoomResponseDTO> chatRooms = chatRoomService.findAllBy(brokerId);
        model.addAttribute("chatRooms", chatRooms);
        return "roomList";
    }

    @GetMapping(value = "/room")
    public String enterNewRoom(@RequestParam String chatRoomId, @RequestParam String accountId, Model model){
        ChatRoomResponseDTO chatRoom = chatRoomService.findBy(chatRoomId);

        if (!chatRoom.getParticipantIds().contains(accountId)) {
            chatRoom.setChatMessagesInRoom(chatMessageService.findAllChatMessageBy(chatRoomId));
        } else {
            return "createRoom";
        }

        model.addAttribute("chatRoomId", chatRoom.getId());
        model.addAttribute("nickname", accountId);
        model.addAttribute("chatMessages", chatRoom.getChatMessagesInRoom());

        return "room";
    }

    @DeleteMapping(value = "/room/{chatRoomId}")
    public ResponseEntity<String> delete(@PathVariable String chatRoomId) {
        return ResponseEntity.ok(chatRoomService.deleteBy(chatRoomId));
    }

 }
