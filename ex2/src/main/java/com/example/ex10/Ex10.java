package com.example.ex10;

import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {

    public static void main(String[] args) {

        List<String> words = List.of("cat", "hippo", "tiger");

        int total1 =
                words.stream()
                        .map(String::length)
                        .reduce(0, (a, b) -> a + b);


        int total2 =
                words.stream()
                        .mapToInt(String::length)
                        .sum();

        int total3 =
                words.stream()
                        .map(String::length)
                        .collect(Collectors.reducing(0, (x,y) -> x+y));

        int total4 =
                words.stream()
                        .map(String::length)
                        .collect(Collectors.summingInt(x -> x));


        int total5 =
                words.stream()
                  .collect(Collectors.mapping(String::length,
                                Collectors.reducing(0, (x,y) -> x+y)));


        int total6 =
                words.stream()
                        .collect(Collectors.mapping(String::length,
                                Collectors.summingInt(x -> x)));


        System.out.println(total1);


    }
}
