package com.example.pc;

import java.util.Random;

public class SemaphoreProducerRunnable implements Runnable {

    @Override
    public void run() {
        Random rand = new Random();
        while (true) {
            try {
                Main.semaphore.acquire();
                if (Container.container.size() < 100) {
                    int randomNumber = rand.nextInt(10000);
                    System.out.println("Generated value " + randomNumber);
                    Container.container.add(randomNumber);
                }
            }catch (InterruptedException e){}
            finally {
                Main.semaphore.release();
            }
        }
    }
}
