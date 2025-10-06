package com.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Gatherers;

public class Ex3 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7);


//                .forEach(System.out::println);

//                .reduce((a,b) -> a+b);
//                .reduce(0, (a,b) -> a+b);

//                .allMatch(v -> v == 1);
//                .anyMatch(li -> li == 4);
//                .noneMatch(li -> li > 5);

        // collectors
        // gatherers

//        list.stream()
//                .gather(Gatherers.windowFixed(3))
//                .forEach(System.out::println);


//        list.stream()
//                .gather(Gatherers.windowSliding(3))
//                .forEach(System.out::println);


//        list.stream()
//                .gather(Gatherers.scan(() -> 0, (x,y) -> x + y))
//                .forEach(System.out::println);


        long count =
            list.stream()
                    .collect(Collectors.counting());


    }
}
