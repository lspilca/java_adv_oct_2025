package com.example.ex11;

import java.util.concurrent.ForkJoinPool;

public class Ex11 {

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        long fibb = forkJoinPool.invoke(new FibonacciNumberRecursiveTask(100));

        System.out.println(fibb);
    }
}
