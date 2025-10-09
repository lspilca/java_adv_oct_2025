package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

    private static List<Product> list = new ArrayList<>();

    public static void main(String[] args) {
//        while (true) {
//            list.add(new Product(UUID.randomUUID().toString()));
//        }

        Car car1 = new Car.Builder()
                .setColor("black")
                .setModel("Dacia")
                .build();

        Car car2 = new Car.Builder()
                .setColor("black")
                .build();

        Car car3 = new Car.Builder()
                .setSize(10)
                .build();
    }
}