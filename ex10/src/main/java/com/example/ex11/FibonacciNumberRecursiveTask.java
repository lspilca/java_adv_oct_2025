package com.example.ex11;

import java.util.concurrent.RecursiveTask;

public class FibonacciNumberRecursiveTask extends RecursiveTask<Long> {

    private final int n;

    public FibonacciNumberRecursiveTask(int n) {
        this.n = n;
    }

    @Override
    protected Long compute() {
        if (n < 10) {
            return directCalculation(n);
        }

        FibonacciNumberRecursiveTask leftTask = new FibonacciNumberRecursiveTask(n - 2);
        FibonacciNumberRecursiveTask rightTask = new FibonacciNumberRecursiveTask(n - 1);

        leftTask.fork();

        return rightTask.compute() + leftTask.join();
    }

    private long directCalculation(long n) {
        long a = 0;
        long b = 1;

        for (long i = 0; i < n; i++) {
            long t = a;
            a = b;
            b  = t + a;
        }

        return a;
    }
}
