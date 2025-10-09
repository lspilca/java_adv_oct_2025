package com.example.ex12;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Ex12 {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();

        List<Integer> list = List.of(5,2,6,8,4,2,6,8,9,5,2,1);

        List<Integer> sortedList = pool.invoke(new SortNumbersRecursiveTask(list));

        System.out.println(sortedList);
    }
}
