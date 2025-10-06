package com.example.ex17;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex17 {

    public static void main(String[] args) {

        List<String> words = List.of("a","bb","ccc","dd","eee","ff");
        Map<Integer, Long> counts =
                words.stream()
                     .collect(Collectors.groupingBy(String::length,
                             Collectors.counting()));

        System.out.println(counts);


    }
}
