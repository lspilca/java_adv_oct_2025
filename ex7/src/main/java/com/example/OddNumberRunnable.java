package com.example;

import java.time.Duration;

public class OddNumberRunnable implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println(i);
                Thread.sleep(Duration.ofSeconds(1));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
