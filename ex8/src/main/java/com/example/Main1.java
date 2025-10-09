package com.example;

import java.util.concurrent.*;

public class Main1 {
    public static void main(String[] args) {

        Runnable r = () -> System.out.println(":)"); // do not expect a return

        Callable<String> c = () -> "Hello"; // we expect a result

        // Future<String>

        // Pool

        // Executor, ExecutorService, ScheduleExecutorService

        // Runtime.getRuntime().availableProcessors()

        ExecutorService es = null;
        try {
            es = Executors.newSingleThreadExecutor();

            Future<?> future = es.submit(r);

            future.get();
        } catch (InterruptedException | ExecutionException e) {
            // e.getSuppressed()
        } finally {
            es.shutdown();
//            es.shutdownNow();
//            es.close();
        }

    }
}