package com.example;

public class Main4 {

    public static void main(final String[] args) {

        final int x = 10;
        String y;

        switch (x) {
            case 1:
                y = "HELLO";
            break;

            case 2:
                y = "WORLD";
            break;

            default:
                y = "";
        }

        y = switch (x) {
            case 1 -> "HELLO";
            case 2 -> "WORLD";
            default -> "";
        };

    }
}
