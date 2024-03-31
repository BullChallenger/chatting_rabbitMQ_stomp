package com.example.chatting.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/chat")
@Controller
public class ChatRoomController {

    @GetMapping(value = "/room")
    public String getRoom(Long chatRoomId, String nickname, Model model){

        model.addAttribute("chatRoomId", chatRoomId);
        model.addAttribute("nickname", nickname);

        return "room";
    }

}
