package com.example;


import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7);

        list.stream()
            .forEach(System.out::println);

        Stream.generate(new SecureRandom()::nextInt)
                .limit(3)
                .forEach(System.out::println);

        Stream.iterate(0, v -> v + 1)
                .limit(3)
                .forEach(System.out::println);


        Stream.iterate(0,  v -> v < 10, v -> v + 1)
                .forEach(System.out::println);

        //----

        list.stream()
            .filter(v -> v % 2 == 0)
            .forEach(System.out::println);


        list.stream()
            .filter(v -> v % 2 == 0) // 2 4 6
            .map(v -> 2 * v) // 4 8 12
            .forEach(System.out::println);

        // IntStream, LongStream, DoubleStream -> primitive streams

        list.stream()
            .mapToInt(v -> v) // Function<T, R>  ->  ToIntFunction<T>
                .sum();


    }


    public Stream<Integer> createStream() {
        // some logic

        return Stream.empty();
    }


    public List<Integer> createList() {

        return List.of();
    }

    public Optional<String> calculateCode() {


        return Optional.empty();
    }


}