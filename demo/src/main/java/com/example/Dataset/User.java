package com.example.Dataset;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "User")
public class User {
    private String account;
    private String password;
    private String username;
    private String introduction;
    private String gender;
    private Date joinTime;

    public User() {}

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    @Override
    public String toString() {
        return this.account + " " + this.password + " " + this.username + " " + this.introduction + " " + this.gender + " " + this.joinTime;
    }
}
