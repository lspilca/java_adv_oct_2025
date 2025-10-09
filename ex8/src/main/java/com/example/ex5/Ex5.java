package com.example.ex5;

import com.example.ex4.LongRunningRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex5 {

    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newFixedThreadPool(3)) {
//        try (ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())) {
            executor.submit(new LongRunningRunnable());
            executor.submit(new LongRunningRunnable());
            executor.submit(new LongRunningRunnable());
            executor.submit(new LongRunningRunnable());
            executor.submit(new LongRunningRunnable());
        }
    }
}
