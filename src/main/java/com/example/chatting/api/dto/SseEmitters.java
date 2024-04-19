package com.example.chatting.api.dto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.example.chatting.domain.message.ChatMessage;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Component
public class SseEmitters {

	private Map<String, List<SseEmitter>> emitters = new ConcurrentHashMap<>();

	public void count(String chatRoomId, ChatMessage message) {
		this.emitters.get(chatRoomId).forEach(emitter -> {
			try {
				emitter.send(SseEmitter.event()
						.name("chat")
						.data(message));
				emitter.complete();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		});
	}

	public SseEmitter add(String chatRoomId) {
		List<SseEmitter> emitterList = emitters.getOrDefault(chatRoomId, new CopyOnWriteArrayList<>());
		SseEmitter emitter = new SseEmitter(300000L);
		emitterList.add(emitter);
		if (emitters.containsKey(chatRoomId)) {
			this.emitters.replace(chatRoomId, emitterList);
		} else {
			this.emitters.put(chatRoomId, emitterList);
		}

		emitter.onCompletion(() -> {
			emitters.get(chatRoomId).remove(emitter);   // 만료되면 리스트에서 삭제
		});
		emitter.onTimeout(() -> {
			emitters.get(chatRoomId).remove(emitter);   // 만료되면 리스트에서 삭제
		});

		return emitter;
	}

}
