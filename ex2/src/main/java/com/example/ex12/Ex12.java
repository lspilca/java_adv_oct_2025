package com.example.ex12;

import java.util.Arrays;
import java.util.List;

public class Ex12 {

    public static void main(String[] args) {

        List<String> blocks = List.of("abcd", "efg", "apples", "cherries");

        Long c1 = blocks.stream()
                        .flatMap(s -> Arrays.stream(s.split("")))
                        .distinct()
                        .count();

        Long c2 = blocks.stream()
                        .flatMapToInt(s -> s.chars())
                        .distinct()
                        .count();

        System.out.println(c1);
        System.out.println(c2);

    }
}
