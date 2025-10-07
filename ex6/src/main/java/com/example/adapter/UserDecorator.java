package com.example.adapter;

public class UserDecorator {

    private final UserDetails user;

    public UserDecorator(UserDetails user) {
        this.user = user;
    }

    public String username() {
        System.out.println("Entering method: " + user.username());
        String username = user.username();
        System.out.println("After method: " + username);
        return username;
    }
}
