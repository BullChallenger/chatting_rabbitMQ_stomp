package com.example.chatting.domain.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "chat")
public class ChatMessage {

    @Id
    private String id;
    private Long chatRoomId;
    private Long memberId;
    private String nickname;
    private String message;
}
