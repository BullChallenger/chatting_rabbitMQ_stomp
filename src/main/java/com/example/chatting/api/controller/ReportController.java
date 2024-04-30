package com.example.chatting.api.controller;

import com.example.chatting.api.dto.ReportDTO;
import com.example.chatting.api.service.ReportService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping(value = "/report")
@RequiredArgsConstructor
@RestController
public class ReportController {

    private final ReportService reportService;

    @CrossOrigin("*")
    @PostMapping
    public ResponseEntity<Boolean> report(@RequestBody ReportDTO.SendReportDTO request) {
        reportService.addReport(request.getSenderId(), request.getTargetId());
        return ResponseEntity.ok(true);
    }

    @CrossOrigin("*")
    @PostMapping(value = "/all/size")
    public ResponseEntity<List<ReportDTO.GetAllReportResponseDTO>> getAllReportSize(@RequestBody ReportDTO.GetAllReportRequestDTO request) {
        log.info("===========> Redis ==========>");
        return ResponseEntity.ok(reportService.getAllReportByAccountId(request.getAllAccountId()));
    }

    @CrossOrigin("*")
    @GetMapping(value = "/{targetId}/size")
    public ResponseEntity<Long> getReportSize(@PathVariable(value = "targetId") String targetId) {
        return ResponseEntity.ok(reportService.checkReportSize(targetId));
    }

    @CrossOrigin("*")
    @PostMapping(value = "/report/{targetId}/unlock")
    public ResponseEntity<Long> unlockAccount(@PathVariable(value = "targetId") String targetId) {
        reportService.unlockReport(targetId);
        return ResponseEntity.ok(reportService.checkReportSize(targetId));
    }

}
