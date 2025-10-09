package com.example2;

import com.example1.services.TestService;

public class Main {
    public static void main(String[] args) {

        TestService test = TestService.getInstance();
        test.m();

    }

}