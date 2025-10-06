package com.example.ex9;

import java.util.List;
import java.util.Locale;

public class Ex9 {

    public static void main(String[] args) {
        List<String> names = List.of("elena", "maria", "alex");
        List<String> upper =
                names.stream()
                     .map(s -> s.toUpperCase(Locale.ROOT)).toList();

        System.out.println(upper);
    }
}
