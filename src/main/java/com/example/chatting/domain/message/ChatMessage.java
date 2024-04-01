package com.example.chatting.domain.message;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "chat-message")
public class ChatMessage {

    @Id
    private String id;
    private String chatRoomId;
    private Long memberId;
    private String nickname;
    private String message;
}
