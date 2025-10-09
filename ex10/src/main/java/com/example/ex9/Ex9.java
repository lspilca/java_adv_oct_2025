package com.example.ex9;

import java.util.concurrent.ForkJoinPool;

public class Ex9 {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();

        pool.invoke(new PrintThreadNameRecursiveAction());
    }
}
