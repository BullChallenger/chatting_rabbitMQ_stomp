// package com.example.chatting.global.config;
//
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.data.redis.connection.RedisConnectionFactory;
// import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
// import org.springframework.data.redis.core.RedisTemplate;
// import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
// import org.springframework.data.redis.serializer.StringRedisSerializer;
// import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
//
// @Configuration
// public class RedisConfig {
//
//     @Value("${spring.data.redis.host}")
//     private String host;
//
//     @Value("${spring.data.redis.port}")
//     private int port;
//
//     @Bean
//     public RedisTemplate<String, SseEmitter> redisTemplate(RedisConnectionFactory connectionFactory) {
//         RedisTemplate<String, SseEmitter> redisTemplate = new RedisTemplate<>();
//
//         redisTemplate.setKeySerializer(new StringRedisSerializer());
//         redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(SseEmitter.class));
//
//         redisTemplate.setConnectionFactory(connectionFactory);
//         return redisTemplate;
//     }
//
//     @Bean
//     public RedisConnectionFactory redisConnectionFactory() {
//         return new LettuceConnectionFactory(host, port);
//     }
//
// }
