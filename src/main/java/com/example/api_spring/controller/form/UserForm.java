package com.example.api_spring.controller.form;

import com.example.api_spring.model.User;
import com.example.api_spring.repository.UserRepository;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class UserForm {
    private String name;
    private LocalDate bornDate;
    private char sex;
    private String cpf;
    private String document;

    public User convert(){
        return new User(name, bornDate, sex, cpf, document);
    }

    public User update(Long id, UserRepository userRepository){
        User user = userRepository.getOne(id);

        user.setName(this.name);
        user.setBornDate(this.bornDate);
        user.setSex(this.sex);
        user.setCpf(this.cpf);
        user.setDocument(this.document);

        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBornDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(bornDate);
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
