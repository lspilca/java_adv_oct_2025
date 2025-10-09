package com.example.ex3;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex3 {

    public static void main(String[] args) throws Exception {
        try (ExecutorService es = Executors.newSingleThreadExecutor()) {
            Future<String> future = es.submit(new LongRunningCallable());

            while (!future.isDone()) {
                System.out.println("Waiting for call");
                Thread.sleep(Duration.ofSeconds(1));
            }

            String result = future.get();
            System.out.println(result);
        }
    }
}
