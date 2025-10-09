package com.example.ex10;

import java.util.concurrent.ForkJoinPool;

public class Ex10 {

    public static void main(String[] args) {
        ForkJoinPool  pool = new ForkJoinPool();

        pool.invoke(new NumberRecursiveAction(10));
    }
}
