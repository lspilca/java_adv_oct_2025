package com.example.ra;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Main1 {
    public static void main(String[] args) {
        // [1,2,3,4,5,6,7,8,9]  -> [1,2,3,4,5], [6,7,8,9]

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        PrintRecursiveAction printRecursiveAction = new PrintRecursiveAction(list);

        ForkJoinPool pool = new ForkJoinPool();

        pool.invoke(printRecursiveAction);
    }
}