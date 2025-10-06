package com.example.ex16;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex16 {

    public static void main(String[] args) {

        List<String> names = List.of("Ana", "Elena", "Alex", "Ana");
        Map<String, Integer> byLength =
                names.stream()
                     .distinct()
                     .collect(Collectors.toMap(
                             k -> k,
                             k -> k.length()
                     ));

        System.out.println(byLength);


    }
}
