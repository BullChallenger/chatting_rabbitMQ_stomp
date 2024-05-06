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
    public SseEmitter connect(@PathVariable(value = "chatRoomId") String chatRoomId) {
        SseEmitter emitter = sseEmitters.add(chatRoomId);
        try {
            emitter.send(SseEmitter.event()
                    .name("connect")
                    .data("connected!"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return emitter;
    }

    @CrossOrigin("*")
    @PostMapping(value = "/create")
    public ResponseEntity<ChatRoomResponseDTO> create(@RequestBody ChatRoomRequestDTO request) {
        ChatRoom chatRoom = chatRoomRepository.save(ChatRoom.builder()
            .id(UUID.randomUUID().toString())
            .title(request.getTitle())
            .description(request.getDescription())
            .clientId(request.getClientId())
            .agentId(request.getAgentId())
            .build()
        );

        chatMessageRepository.save(new ChatMessage(
            UUID.randomUUID().toString(), chatRoom.getId(),
            "admin", "admin",
            "채팅방이 생성되었습니다.", LocalDateTime.now()
        ));

        return ResponseEntity.ok(ChatRoomResponseDTO.fromEntity(chatRoom));
    }

    @GetMapping(value = "/{accountId}/room/th")
    public String findAllBy(@PathVariable(value = "accountId") String accountId, Model model) {
        List<ChatRoomListResponseDTO> chatRooms = chatRoomService.findAllBy(accountId);
        model.addAttribute("chatRooms", chatRooms);
        return "roomList";
    }

    @CrossOrigin("*")
    @GetMapping(value = "find/{accountId}/room")
    public ResponseEntity<List<ChatRoomListResponseDTO>> findAllBy(@PathVariable String accountId) {
        List<ChatRoomListResponseDTO> chatRooms = chatRoomService.findAllBy(accountId);
        return ResponseEntity.ok(chatRooms);
    }

    @GetMapping(value = "/room")
    public String enterNewRoom(@RequestParam String chatRoomId, @RequestParam String accountId, Model model){
        ChatRoomResponseDTO chatRoom = chatRoomService.findBy(chatRoomId);

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
