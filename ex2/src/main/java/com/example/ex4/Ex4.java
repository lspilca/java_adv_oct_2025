package com.example.ex4;

public class Ex4 {

    static String cityIfUser1(Object o) {
        if (o instanceof User(_, Address(String city, _))) {
            return city;
        }
        return "unknown";
    }

    static String cityIfUser2(Object o) {
        return switch (o) {
            case User(_, Address(String city, _)) -> city;
            default -> "unknown";
        };
    }

}
