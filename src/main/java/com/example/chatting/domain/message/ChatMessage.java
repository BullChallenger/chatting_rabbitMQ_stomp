package com.example.chatting.domain.message;

import java.time.LocalDateTime;

import lombok.ToString;
import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
@Document(collection = "chat-message")
public class ChatMessage {

    @Id
    private String id;
    private String chatRoomId;
    private String accountId;
    private String nickname;
    private String message;

    private LocalDateTime createdAt;

    public void initChatMessageId(String id) {
        this.id = id;
    }

    public void createdAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}
