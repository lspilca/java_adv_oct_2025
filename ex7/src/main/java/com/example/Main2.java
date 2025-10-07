package com.example;

public class Main2 {

    public static void main(String[] args) {

        Thread t1 = Thread.ofPlatform()
                .daemon()
                .unstarted(new MessageRunnable());

        t1.start();

        System.out.println(Thread.currentThread().getName()); // main
    }

}
