package com.example.ex8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex8 {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1,2,3,4,5,6);

        List<Integer> evens1 =
                nums.stream().filter(x -> x % 2 == 0).toList();


        List<Integer> evens2 =
                nums.stream().filter(x -> x % 2 == 0)
                                .collect(Collectors.toList());

        List<Integer> evens3 =
                nums.stream().filter(x -> x % 2 == 0)
                        .collect(Collectors.toCollection(ArrayList::new));


        Set<Integer> evens4 =
                nums.stream().filter(x -> x % 2 == 0)
                        .collect(Collectors.toSet());

        System.out.println(evens1);



    }
}
