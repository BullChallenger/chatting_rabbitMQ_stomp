package com.example.chatting.api.controller;

import com.example.chatting.api.dto.AccountDTO.AccountRequestDTO;
import com.example.chatting.api.dto.AccountDTO.LoginDTO;
import com.example.chatting.api.service.AccountService;
import com.example.chatting.domain.account.Account;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@RequiredArgsConstructor
@Controller
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/join")
    public String join() {
        return "join";
    }

    @PostMapping("/join")
    public RedirectView join(@RequestBody AccountRequestDTO request, RedirectAttributes attributes) {
        accountService.save(request);
        attributes.addFlashAttribute("message", "회원가입이 완료되었습니다. 로그인해주세요.");
        return new RedirectView("/login", true);
    }

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public RedirectView loginSubmit(@RequestBody LoginDTO request, HttpSession session, RedirectAttributes attributes) {
        Account account = accountService.findByEmail(request.getEmail());
        if (account.getPassword().equals(request.getPassword())) {
            session.setAttribute("account", session);
            attributes.addFlashAttribute("message", "로그인 성공");
            return new RedirectView("/chat/" + account.getId() + "/room/th", true);
        } else {
            throw new IllegalArgumentException("비밀번호 틀림");
        }
    }

}
