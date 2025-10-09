package com.example.pc;

import java.util.concurrent.Semaphore;

public class Main {

    public static Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args) {
        Thread.ofPlatform()
                .name("C1")
                .start(new ConsumerRunnable());
        Thread.ofPlatform()
                .name("C2")
                .start(new ConsumerRunnable());
        Thread.ofPlatform()
                .name("C3")
                .start(new ConsumerRunnable());

        RandomValueProducedListener randomValueProducedListener = (e) -> {
            System.out.println("Event observed " + e);
        };

        ProducerRunnable p1 = new ProducerRunnable();
        p1.addRandomValueProducedListener(randomValueProducedListener);

        ProducerRunnable p2 = new ProducerRunnable();
        p2.addRandomValueProducedListener(randomValueProducedListener);

        ProducerRunnable p3 = new ProducerRunnable();
        p2.addRandomValueProducedListener(randomValueProducedListener);

        Thread.ofPlatform()
                .name("P1")
                .start(p1);
        Thread.ofPlatform()
                .name("P2")
                .start(p2);
        Thread.ofPlatform()
                .name("P3")
                .start(p3);


        // Race condition, Deadlocks, Livelocks, Starvation
    }
}
