package com.example.chatting.api.controller;

import com.example.chatting.api.dto.ChatRoomDTO.ChatRoomListResponseDTO;
import com.example.chatting.api.dto.ChatRoomDTO.ChatRoomRequestDTO;
import com.example.chatting.api.dto.ChatRoomDTO.ChatRoomResponseDTO;
import com.example.chatting.api.dto.SseEmitters;
import com.example.chatting.api.service.ChatMessageService;
import com.example.chatting.api.service.ChatRoomService;
import com.example.chatting.domain.chatRoom.ChatRoom;
import com.example.chatting.domain.chatRoom.ChatRoomRepository;
import com.example.chatting.domain.message.ChatMessage;
import com.example.chatting.domain.message.ChatMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping(value = "/chat")
@Controller
public class ChatRoomController {

    private final ChatRoomService chatRoomService;
    private final ChatMessageService chatMessageService;
    private final ChatMessageRepository chatMessageRepository;
    private final ChatRoomRepository chatRoomRepository;
    private final SseEmitters sseEmitters;

    @CrossOrigin("*")
    @GetMapping(value = "/connect/{chatRoomId}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public ResponseEntity<SseEmitter> connect(@PathVariable(value = "chatRoomId") String chatRoomId) {
        System.out.println("Connected!");
        SseEmitter emitter = sseEmitters.add(chatRoomId);
        try {
            emitter.send(SseEmitter.event()
                    .name("connect")
                    .data("connected!"));

            System.out.println("Send SSE!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Send!");
        return ResponseEntity.ok(emitter);
    }

    @ResponseBody
    @CrossOrigin("*")
    @PostMapping(value = "/create")
    public ResponseEntity<ChatRoomResponseDTO> create(@RequestBody ChatRoomRequestDTO request) {
        ChatRoom chatRoom = chatRoomRepository.save(ChatRoom.builder()
            .id(UUID.randomUUID().toString())
            .clientId(request.getClientId())
            .agentId(request.getBrokerId())
            .build()
        );

        chatMessageRepository.save(new ChatMessage(
            UUID.randomUUID().toString(), chatRoom.getId(),
            "admin", "admin",
            "채팅방이 생성되었습니다.", LocalDateTime.now()
        ));

        return ResponseEntity.ok(ChatRoomResponseDTO.fromEntity(chatRoom));
    }

    @ResponseBody
    @CrossOrigin("*")
    @GetMapping(value = "/{brokerId}/room")
    public ResponseEntity<List<ChatRoomListResponseDTO>> findAllByJson(@PathVariable(value = "brokerId") String brokerId) {
        List<ChatRoomListResponseDTO> chatRooms = chatRoomService.findAllByAgentId(brokerId);

        chatRooms.forEach(chatRoomResponseDTO -> chatRoomResponseDTO.setRecentMessage(
            chatMessageService.findLatestMessageInChatRoom(chatRoomResponseDTO.getId()))
        );

        return ResponseEntity.ok(chatRooms);
    }

    @GetMapping(value = "/{brokerId}/room/th")
    public String findAllBy(@PathVariable(value = "brokerId") String brokerId, Model model) {
        List<ChatRoomListResponseDTO> chatRooms = chatRoomService.findAllByAgentId(brokerId);
        model.addAttribute("chatRooms", chatRooms);
        return "roomList";
    }

    @ResponseBody
    @CrossOrigin("*")
    @GetMapping(value = "/room/resp")
    public ResponseEntity<ChatRoomResponseDTO> enterRoom(@RequestParam String chatRoomId, @RequestParam String accountId, Model model){
        ChatRoomResponseDTO chatRoom = chatRoomService.findBy(chatRoomId);

        if (chatRoom.getParticipantIds().contains(accountId)) {
            chatRoom.setChatMessagesInRoom(chatMessageService.findAllChatMessageBy(chatRoomId));
        }

        return ResponseEntity.ok(chatRoom);
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
