package com.example.ex13;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex13 {


    public static void main(String[] args) {

        List<String> words = List.of("a","bb","ccc","dd","eee");

        Map<Integer,List<String>> byLen =
                words.stream()
                     .collect(Collectors.groupingBy(String::length));

        Map<Integer,String> byLenJoined =
                words.stream()
                        .collect(Collectors.groupingBy(String::length,
                                        Collectors.joining()));

        Map<Integer, Set<String>> byLen3 =
                words.stream()
                        .collect(Collectors.groupingBy(String::length,
                                    Collectors.toSet()));

        System.out.println(byLen);


        // {1=a, 2=bbdd, 3=ccceee}
        System.out.println(byLenJoined);


    }
}
