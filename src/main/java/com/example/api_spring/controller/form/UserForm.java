package com.example.api_spring.controller.form;

import com.example.api_spring.model.User;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserForm {
    private String name;
    private Date bornDate;
    private char sex;
    private String cpf;
    private String document;

    public User convert(){
        return new User(name, bornDate, sex, cpf, document);
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

    public void setBornDate(Date bornDate) {
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
