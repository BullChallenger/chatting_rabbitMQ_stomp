package com.example.chatting.api.dto;

import lombok.Getter;

public class AccountDTO {

    @Getter
    public static class AccountRequestDTO {
        private String email;
        private String nickname;
        private String password;
    }

    @Getter
    public static class LoginDTO {
        private String email;
        private String password;
    }

}
