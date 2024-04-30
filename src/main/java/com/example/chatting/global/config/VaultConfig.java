package com.example.chatting.global.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;

@Getter
@ConfigurationProperties(value = "keypair")
public class VaultConfig {

	private String id;
	private String password;

	public VaultConfig(String id, String password) {
		this.id = id;
		this.password = password;
	}

}
