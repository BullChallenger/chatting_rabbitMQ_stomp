package com.example.chatting.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.chatting.api.dto.ChatRoomDTO.*;
import com.example.chatting.api.dto.ContractDTO.*;
import com.example.chatting.api.service.ChatMessageService;
import com.example.chatting.api.service.ChatRoomService;
import com.example.grpc.zip.ZipGrpcServiceGrpc;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(value = "/chat")
@Controller
public class ChatRoomController {

    private final ChatRoomService chatRoomService;
    private final ChatMessageService chatMessageService;

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
