package com.example.ex5;

public class Ex5 {

    static String describe(Object o) {
        return switch (o) {
            case null -> "null";
            case Integer i -> "int " + i;
            case String s -> "string " + s.toUpperCase();
            default -> "other";
        };
    }

}
