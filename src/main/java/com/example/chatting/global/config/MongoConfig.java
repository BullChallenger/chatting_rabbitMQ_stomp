package com.example.chatting.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(value = "com.example.chatting.domain.message")
@EnableMongoAuditing
@Configuration
public class MongoConfig {
}
