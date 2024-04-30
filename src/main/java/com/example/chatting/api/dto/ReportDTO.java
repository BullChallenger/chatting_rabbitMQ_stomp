package com.example.chatting.api.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class ReportDTO {

    @Getter
    public static class SendReportDTO {
        private String senderId;
        private String targetId;
    }

    @Getter
    public static class GetAllReportRequestDTO {
        private List<String> allAccountId;
    }

    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @Getter
    public static class GetAllReportResponseDTO {
        private String accountId;
        private Long reportSize;

        public GetAllReportResponseDTO(String accountId, Long reportSize) {
            this.accountId = accountId;
            this.reportSize = reportSize;
        }
    }

}
