package com.example.testproject.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is required")
    private String email;


    @Column(unique = true)
    @NotBlank(message = "Username is required")
    private String username;

    @Size(min = 6, message = "Password should have at least 6 characters")
    @NotBlank(message = "Password is required")
    private String password;

    private String name;

    @ManyToOne
    private Role role;
    @ManyToOne
    private Status status;
}
