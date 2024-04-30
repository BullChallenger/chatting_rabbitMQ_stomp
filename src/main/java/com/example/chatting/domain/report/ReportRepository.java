package com.example.chatting.domain.report;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class ReportRepository {

    private final RedisTemplate<String, String> redisTemplateForReport;

    public void saveReport(String senderId, String targetId) {
        redisTemplateForReport.opsForSet().add(targetId, senderId);
    }

    public Long checkReportSize(String targetId) {
        return redisTemplateForReport.opsForSet().size(targetId);
    }

    public void unlockReport(String targetId) {
        redisTemplateForReport.opsForSet().getOperations().delete(targetId);
    }

}
