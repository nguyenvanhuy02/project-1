package com.example.anime.service;

import com.example.anime.model.account.Account;

import java.util.Optional;

public interface IAccountService {

    Account findAccountByUsername(String username);

    Account createAccount(Account account);

    Boolean existsByUserName ( String username);

    Optional<Account> findByName(String userName);

    void updatePassword(String password , String userName);
}
