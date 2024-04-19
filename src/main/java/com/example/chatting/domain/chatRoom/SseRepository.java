// package com.example.chatting.domain.chatRoom;
//
// import java.util.List;
// import java.util.Optional;
// import java.util.Set;
// import lombok.RequiredArgsConstructor;
// import org.springframework.data.redis.core.RedisTemplate;
// import org.springframework.stereotype.Repository;
// import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
//
// @RequiredArgsConstructor
// @Repository
// public class SseRepository {
//
//     private final RedisTemplate<String, SseEmitter> redisTemplate;
//
//     public SseEmitter addSse(String chatRoomId) {
//         SseEmitter sseEmitter = new SseEmitter(3000000L);
//         redisTemplate.opsForList().rightPush(chatRoomId, sseEmitter);
//         return sseEmitter;
//     // }a
//
//     public List<SseEmitter> findBy(String chatRoomId) {
//        return redisTemplate.opsForList().range(chatRoomId, 0, -1);
//     }
//
//     public void deleteBy(String chatRoomId, SseEmitter sseEmitter) {
//         this.findBy(chatRoomId).remove(sseEmitter);
//     }
//
// }
