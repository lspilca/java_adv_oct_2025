package com.example.adapter;

import java.util.List;

public interface UserDetails {

    String username();
    String password();
    List<String> authorities();

}
