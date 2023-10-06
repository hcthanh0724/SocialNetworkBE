package com.example.testproject.service;

import com.example.testproject.model.Account;
import com.example.testproject.respository.IAccountRepo;
import com.example.testproject.service.impl.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
//4.
public class AccountService implements IAccountService {
    @Autowired
    IAccountRepo iAccountRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = iAccountRepo.getAccountByUsername(username);
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add((GrantedAuthority) account.getRole());
        return new User(account.getUsername(), account.getPassword(), roles);
    }

    @Override
    public Account getAccountLogin(String username, String password) {
        Account account = iAccountRepo.getAccountByUsernameAndPassword(username,password);
        return account;
    }

    @Override
    public Account changePassword(String username,String password) {
        Account account = iAccountRepo.getAccountByUsername(username);
        account.setPassword(password);
        iAccountRepo.save(account);
        return account;
    }

    @Override
    public Account findAccountByUsername(String username) {
        return iAccountRepo.getAccountByUsername(username);
    }
}
