package com.example.chatting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.vault.core.VaultKeyValueOperationsSupport;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponse;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
public class ChattingApplication {

//    @Autowired
//    private VaultTemplate vaultTemplate;

    public static void main(String[] args) {
        log.info("Spring Boot Start ====>");
        SpringApplication.run(ChattingApplication.class, args);
    }

//    @PostConstruct
//    public void init() {
//        VaultResponse response = vaultTemplate.opsForKeyValue("vault_test",
//                VaultKeyValueOperationsSupport.KeyValueBackend.KV_1).get("keypair");
//        log.info("======================Vault Log Start!!!");
//        System.out.println(response.getData().get("id"));
//        System.out.println(response.getData().get("password"));
//        System.out.println("-------------------------------");
//        System.out.println();
//        log.info("======================Vault Log End!!!");
//    }

}
