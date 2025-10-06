package com.example;

public class Main5 {


    public static void main(String[] args) {

        final int x = 10;
        final String y = switch (x) {
            case 1 -> "HELLO";
            case 2 -> "WORLD";
            default -> throw new RuntimeException("Invalid x");
        };

    }
}
