package com.example.join;

public class JoinExample {

    public static void main(String[] args) throws Exception {

        Thread t1 = Thread.ofVirtual().start(() -> System.out.println("Collect data from source A -> Database"));
        Thread t2 = Thread.ofVirtual().start(() -> System.out.println("Collect data from source B -> File"));

        t1.join(1000);
        t2.join();

        System.out.println("PROCESS Data from A and B");
    }
}
