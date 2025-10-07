package com.example;

public class Main3 {

    public static void main(String[] args) {
        Thread.ofPlatform().start(new EvenNumberRunnable());
        Thread.ofPlatform().start(new OddNumberRunnable());
        System.out.println("End main");
    }
}
