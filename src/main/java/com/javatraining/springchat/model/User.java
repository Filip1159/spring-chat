package com.javatraining.springchat.model;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username, name, surname, password;

    @OneToMany
    @JoinColumn(name = "user1Id")
    private List<Conversation> conversations;
}
