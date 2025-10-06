package com.example.ex11;

import java.util.Comparator;
import java.util.List;

public class Ex11 {

    public static void main(String[] args) {

        List<String> cities = List.of("Rome","Paris","Rome","Berlin","Paris","Madrid");

        List<String> result1 =
                cities.stream()
                        .distinct()
                        .sorted()
                        .toList();

        List<String> result2 =
                cities.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .toList();


        System.out.println(result1);


    }
}
