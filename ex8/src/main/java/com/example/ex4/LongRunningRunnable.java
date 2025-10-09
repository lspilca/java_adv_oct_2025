package com.example.ex4;

import java.time.Duration;
import java.time.LocalDateTime;

public class LongRunningRunnable implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is running " + LocalDateTime.now());
            Thread.sleep(Duration.ofSeconds(10));
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
