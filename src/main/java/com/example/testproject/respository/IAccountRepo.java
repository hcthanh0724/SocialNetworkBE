package com.example.testproject.respository;

import com.example.testproject.model.Account;
import com.example.testproject.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepo extends JpaRepository<Account,Long> {
    Account getAccountByUsername(String username);
    Account getAccountByUsernameAndPassword(String username, String password);
}
