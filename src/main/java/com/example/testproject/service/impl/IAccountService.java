package com.example.testproject.service.impl;

import com.example.testproject.model.Account;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IAccountService extends UserDetailsService {
    UserDetails loadUserByUsername(String username);
    Account getAccountLogin (String username, String password);
    Account changePassword(String username, String password);
    Account findAccountByUsername(String username);
}
