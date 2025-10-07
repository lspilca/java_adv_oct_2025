package com.example.pc;

import java.util.Random;

public class ProducerRunnable implements Runnable {

    @Override
    public void run() {
        Random rand = new Random();
        try {
            while (true) {
                synchronized (Container.container) {
                    if (Container.container.size() < 100) {
                        int randomNumber = rand.nextInt(10000);
                        System.out.println("Generated value " + randomNumber);
                        Container.container.add(randomNumber);
                        Container.container.notifyAll();
                    } else {
                        Container.container.wait();
                    }
                }
            }
        } catch (InterruptedException e) {}
    }
}
