package com.dude.funky.charitylookup;

public class UserInformation {
    private String email;
    private String username;
    private String name;
    private String password;

    public UserInformation(String email, String name, String password) {
        this.email = email;
        //this.username = username;
        this.name = name;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
