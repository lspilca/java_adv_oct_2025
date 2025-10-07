package com.example.adapter;

import java.util.List;

public class UserAdapter implements UserDetails {

    private final User user;

    public UserAdapter(User user) {
        this.user = user;
    }

    @Override
    public String username() {
        return user.username();
    }

    @Override
    public String password() {
        return user.password();
    }

    @Override
    public List<String> authorities() {
        return List.of();
    }
}
