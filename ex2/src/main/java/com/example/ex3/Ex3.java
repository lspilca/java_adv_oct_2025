package com.example.ex3;

public class Ex3 {

    static int safeLength(Object o) {
        if (o instanceof String s) {
            return s.length();
        }
        return -1;
    }

}
