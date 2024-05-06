package com.example.chatting.api.service;

import com.example.chatting.api.dto.AccountDTO.AccountRequestDTO;
import com.example.chatting.domain.account.Account;
import com.example.chatting.domain.account.AccountRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public Account save(AccountRequestDTO request) {
        String id = UUID.randomUUID().toString();
        Account account = Account.of(id, request.getEmail(), request.getNickname(), request.getPassword());
        return accountRepository.save(account);
    }

    public Account findByEmail(String email) {
        return accountRepository.findByEmail(email);
    }

    public Account findById(String id) {
        Optional<Account> account = accountRepository.findById(id);
        if (account.isPresent()) {
            return account.get();
        } else {
            throw new EntityNotFoundException();
        }
    }

    public void deleteById(String id) {
        accountRepository.deleteById(id);
    }

}
