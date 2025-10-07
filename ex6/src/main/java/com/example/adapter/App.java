package com.example.adapter;

public class App {

    public static void main(String[] args) {

        UserDetails userDetails = new UserAdapter(new User("Bob", "", false));

        UserDecorator userDecorator = new UserDecorator(userDetails);

        String username = userDecorator.username();

        System.out.println(username);
    }
}
