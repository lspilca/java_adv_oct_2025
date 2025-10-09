package com.example;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main4 {

    public static void main(String[] args) {
        try (ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor()) {

//            scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("!"),  0, 3, TimeUnit.SECONDS);
            scheduledExecutorService.scheduleWithFixedDelay(() -> System.out.println("!"),  0, 3, TimeUnit.SECONDS);

            Thread.sleep(Duration.ofSeconds(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
