package com.example;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Circle c = new Circle() {

            @Override
            public double area() {
                return 3.14;
            }
        };

        Shape s1 = new Shape() {
            @Override
            public double area() {
                return 1;
            }
        };

        Shape s2 = () -> 1; // feeling of a function

        // ::

        Consumer c2 = s -> System.out.println(s);
        Consumer c3 = System.out::println;

        SecureRandom sr = new SecureRandom();
        Shape s4 = sr::nextDouble;

        Shape s5 = Main::generateValue;

        CircleGenerator cg1 = Circle::new;
        CircleGenerator cg2 = () -> new Circle();

        Map<Integer, Integer> map = Map.of(1,2,3,4,5,6);
        map.forEach((k, v) -> System.out.println(k + " " + v));

//        IntStream, LongStream, DoubleStream

//        ArrayList<Integer>,ArrayList<String> -> Object[]

        /*

        Predicate<T> -> boolean
        BiPredicate<T,V> -> boolean
        Consumer<T> -> void
        BiConsumer<T,V> -> void
        Supplier<T> -> T
        Function<T,R> -> R
        BiFunction<T,V,R> -> R
        UnaryOperator<T> -> T
        BinaryOperator<T> -> T


         */


    }


    static double generateValue() {
        return 10;
    }

}