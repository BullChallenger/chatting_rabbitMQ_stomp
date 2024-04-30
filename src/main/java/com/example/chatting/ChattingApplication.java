package com.example.chatting;

<<<<<<< HEAD
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
=======
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
>>>>>>> c00bd5a8dbdb509ca97b65487ec33d1eff791909
import org.springframework.vault.core.VaultKeyValueOperationsSupport;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponse;

<<<<<<< HEAD
import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
public class ChattingApplication {

//    @Autowired
//    private VaultTemplate vaultTemplate;
=======
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
>>>>>>> c00bd5a8dbdb509ca97b65487ec33d1eff791909

    public static void main(String[] args) {
        log.info("Spring Boot Start ====>");
        SpringApplication.run(ChattingApplication.class, args);
    }

<<<<<<< HEAD
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
=======
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
>>>>>>> c00bd5a8dbdb509ca97b65487ec33d1eff791909

}
