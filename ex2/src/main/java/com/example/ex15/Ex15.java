package com.example.ex15;

import java.util.List;
import java.util.stream.Gatherers;

public class Ex15 {

    public static void main(String[] args) {

        List<Integer> src = List.of(1,2,3,4);
        List<Integer> running = src.stream()
                .gather(Gatherers.fold(() -> 0 , (x,y) -> x + y))
                .toList();
        System.out.println(running);


    }
}
