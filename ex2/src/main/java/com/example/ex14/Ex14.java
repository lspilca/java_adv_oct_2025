package com.example.ex14;

import java.util.List;
import java.util.stream.Gatherers;
import java.util.stream.IntStream;

public class Ex14 {


    public static void main(String[] args) {

        List<Integer> src = IntStream.rangeClosed(1,10).boxed().toList();
        List<List<Integer>> windows =
                         src.stream()
                          .gather(Gatherers.windowFixed(3))
                          .toList();
        System.out.println(windows);


    }
}
