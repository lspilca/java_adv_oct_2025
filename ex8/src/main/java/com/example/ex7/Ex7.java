package com.example.ex7;

import com.example.ex3.LongRunningCallable;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex7 {

    public static void main(String[] args) {
        try (ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())) {
            List<Future<String>> futures = executorService.invokeAll(List.of(new LongRunningCallable(), new LongRunningCallable()));

            for (Future<String> future : futures) {
                System.out.println(future.get());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
