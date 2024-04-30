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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping(value = "/chat")
@RestController
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

    @CrossOrigin("*")
    @GetMapping(value = "/{agentId}/room")
    public ResponseEntity<List<ChatRoomListResponseDTO>> findAllByAgentId(@PathVariable(value = "agentId") String agentId) {
        List<ChatRoomListResponseDTO> chatRooms = chatRoomService.findAllByAgentId(agentId);

        chatRooms.stream().filter(chatRoomListResponseDTO -> !chatRoomListResponseDTO.getNickname().equals("admin")).forEach(chatRoomResponseDTO -> chatRoomResponseDTO.setRecentMessage(
            chatMessageService.findLatestMessageInChatRoom(chatRoomResponseDTO.getId()))
        );

        return ResponseEntity.ok(chatRooms);
    }

    @CrossOrigin("*")
    @GetMapping(value = "/{clientId}/room")
    public ResponseEntity<List<ChatRoomListResponseDTO>> findAllByClientId(@PathVariable(value = "clientId") String clientId) {
        List<ChatRoomListResponseDTO> chatRooms = chatRoomService.findAllByClientId(clientId);

        chatRooms.stream().filter(chatRoomListResponseDTO -> !chatRoomListResponseDTO.getNickname().equals("admin")).forEach(chatRoomResponseDTO -> chatRoomResponseDTO.setRecentMessage(
            chatMessageService.findLatestMessageInChatRoom(chatRoomResponseDTO.getId()))
        );

        return ResponseEntity.ok(chatRooms);
    }

    @CrossOrigin("*")
    @GetMapping(value = "find/{accountId}/room")
    public ResponseEntity<List<ChatRoomListResponseDTO>> findAllBy(@PathVariable String accountId) {
        List<ChatRoomListResponseDTO> chatRooms = chatRoomService.findAllBy(accountId);

        chatRooms.stream().filter(chatRoomListResponseDTO -> !chatRoomListResponseDTO.getNickname().equals("admin")).forEach(chatRoomResponseDTO -> chatRoomResponseDTO.setRecentMessage(
            chatMessageService.findLatestMessageInChatRoom(chatRoomResponseDTO.getId()))
        );

        return ResponseEntity.ok(chatRooms);
    }

    @CrossOrigin("*")
    @GetMapping(value = "/room")
    public ResponseEntity<ChatRoomResponseDTO> enterRoom(@RequestParam String chatRoomId){
        ChatRoomResponseDTO chatRoom = chatRoomService.findBy(chatRoomId);

        List<ChatMessage> chatMessageInRoom = chatMessageService.findAllChatMessageBy(chatRoomId);
        if (!chatMessageInRoom.isEmpty()) {
            chatRoom.setChatMessagesInRoom(chatMessageInRoom);
        }

        return ResponseEntity.ok(chatRoom);
    }

    @CrossOrigin("*")
    @DeleteMapping(value = "/room/{chatRoomId}")
    public ResponseEntity<String> delete(@PathVariable String chatRoomId) {
        return ResponseEntity.ok(chatRoomService.deleteBy(chatRoomId));
    }

 }
