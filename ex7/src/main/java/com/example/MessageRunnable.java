package com.example;

public class MessageRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(":)");
        System.out.println(Thread.currentThread().getName()); // Thread-x
    }
}
