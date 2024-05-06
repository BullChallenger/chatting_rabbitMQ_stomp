package com.example.chatting.domain.account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Account {

    @Id
    private String id;

    private String email;

    private String nickname;

    private String password;

    @Builder
    public Account(String id, String email, String nickname, String password) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.password = password;
    }

    public static Account of(String id, String email, String nickname, String password) {
        return Account.builder()
                .id(id)
                .email(email)
                .nickname(nickname)
                .password(password)
                .build();
    }

}
