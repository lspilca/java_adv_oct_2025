package com.example;


public class Main1 {
    public static void main(String[] args) {
        // Runnable, Callable -> Future

//        Thread t1 = Thread.ofVirtual()   -> Always daemon
//        Thread t1 = Thread.ofPlatform()

        Thread t1 = Thread.ofVirtual().unstarted(() -> System.out.println("Thread 1 started"));
        t1.start();

        Thread.ofVirtual().start(() -> System.out.println("Thread 1 started")); // JVM borrows a pool of OS threads (CPU no) - acquire 1 -> releases

        /*

        HTTP -> T1
           T1    read invoices from DB   -> blocking
           T1    go through each invoice and put some message on a Kafka queue  -> blocking
           T1    call an endpoint of another service  -> blocking
           T1    write something in the DB -> blocking
           T1    update something in the DB -> blocking

         */

        Thread.ofPlatform().start(() -> System.out.println("Thread 1 started")); // borrows a thread the OS
    }
}