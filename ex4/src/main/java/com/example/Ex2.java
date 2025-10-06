package com.example;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {

        List<List<Integer>> list = List.of(List.of(1,2), List.of(3,4), List.of(5,6,7));

        list.stream()  // List.of(1,2), List.of(3,4), List.of(5,6,7)
                .flatMap(List::stream)  // 1,2,3,4,5,6,7
                .forEach(System.out::println);

        list.stream()  // List.of(1,2), List.of(3,4), List.of(5,6,7)
                .flatMapToInt(li -> li.stream().mapToInt(v -> v))  // 1,2,3,4,5,6,7
                .forEach(System.out::println);


    }
}
