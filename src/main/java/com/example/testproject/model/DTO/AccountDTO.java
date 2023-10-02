package com.example.testproject.model.DTO;

import com.example.testproject.model.Role;
import com.example.testproject.model.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    private long id;
    private String email;
    private String name;
    private String username;
    private Status status;
    private Role role;
    private String token;
}
