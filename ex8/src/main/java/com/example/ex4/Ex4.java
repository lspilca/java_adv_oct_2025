package com.example.ex4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex4 {

    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newSingleThreadExecutor()) {
            executor.submit(new LongRunningRunnable());
            executor.submit(new LongRunningRunnable());
            executor.submit(new LongRunningRunnable());
        }
    }
}
