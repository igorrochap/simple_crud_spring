package com.example.api_spring.controller.dto;

import com.example.api_spring.model.User;


import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class UserDto {
    private long id;
    private String name;
    private LocalDate bornDate;
    private char sex;
    private String cpf;
    private String document;


    public UserDto(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.bornDate = user.getBornDate();
        this.sex = user.getSex();
        this.cpf = user.getCpf();
        this.document = user.getDocument();
    }

    public static List<UserDto> convert(List<User> users){
        return users.stream().map(UserDto::new).collect(Collectors.toList());
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public char getSex() {
        return sex;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDocument() {
        return document;
    }
}
