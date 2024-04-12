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

	private final List<SseEmitter> emitters = new ArrayList<>();

	public void count(ChatMessage message) {
		emitters.forEach(emitter -> {
			try {
				emitter.send(SseEmitter.event()
					.name("count")
					.data(message));
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		});
	}

	public SseEmitter add(SseEmitter emitter) {

		log.info("new emitter added: {}", emitter);
		log.info("emitter list size: {}", emitters.size());
		emitter.onCompletion(() -> {
			log.info("onCompletion callback");
			this.emitters.remove(emitter);    // 만료되면 리스트에서 삭제
		});
		emitter.onTimeout(() -> {
			log.info("onTimeout callback");
			emitter.complete();
		});

		return emitter;
	}

}
