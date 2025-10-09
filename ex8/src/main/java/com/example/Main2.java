package com.example;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) {

        // Future vs CompletableFuture vs Parallel Streams

        // ExecutorServices, ForkJoin, Parallel Stream, CompletableFuture

        // Functional approach to deal with standalone tasks in a multithreaded way
        CompletableFuture.runAsync(() -> // very ugly in terms of syntax
            System.out.println("Done")
        ).thenAccept(System.out::println)
         .exceptionally(e -> {
            System.out.println("Exception: " + e);
            return null;
         });


        // Functional approach to deal with collections in a multithreaded way
        Stream.of(1,2,3,4,5,6,7,8)
                .parallel()
                .distinct()
                .map(x -> x * x)
                .forEach(System.out::println);


    }
}
