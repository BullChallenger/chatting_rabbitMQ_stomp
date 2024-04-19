package com.example.chatting;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.vault.core.VaultKeyValueOperationsSupport;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponse;

import com.example.chatting.global.config.VaultConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableConfigurationProperties(VaultConfig.class)
@SpringBootApplication
public class ChattingApplication {

    private final VaultTemplate vaultTemplate;

    public ChattingApplication(VaultTemplate vaultTemplate) {
        this.vaultTemplate = vaultTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(ChattingApplication.class, args);
    }

    @PostConstruct
    public void init() {
        VaultResponse response = vaultTemplate.opsForKeyValue("vault_test",
            VaultKeyValueOperationsSupport.KeyValueBackend.KV_1).get("keypair");
        System.out.println("-------------------------------");
        System.out.println(response.getData().get("id"));
        System.out.println(response.getData().get("password"));
        System.out.println("-------------------------------");
        System.out.println();
    }

}
