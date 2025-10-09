package com.example.rt;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Main2 {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        Integer result = pool.invoke(new SumRecursiveTask(list));

        System.out.println(result);

    }
}
