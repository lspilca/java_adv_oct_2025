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

        Thread.ofPlatform()
                .name("P1")
                .start(new ProducerRunnable());
        Thread.ofPlatform()
                .name("P2")
                .start(new ProducerRunnable());
        Thread.ofPlatform()
                .name("P3")
                .start(new ProducerRunnable());


        // Race condition, Deadlocks, Livelocks, Starvation
    }
}
