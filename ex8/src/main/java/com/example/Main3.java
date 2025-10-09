package com.example;

import java.util.concurrent.*;

public class Main3 {

    public static void main(String[] args) {
        ScheduledExecutorService es = null;
        try {
            es = Executors.newScheduledThreadPool(2);

            Future<?> f = es.schedule(() -> System.out.println("Hello World"), 10, TimeUnit.SECONDS);

            f.get();
        } catch (ExecutionException e) {
//            e.getSuppressed()
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            es.shutdown();
        }

    }
}
