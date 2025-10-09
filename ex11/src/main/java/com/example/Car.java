package com.example;

public class Car {

    private String color;
    private String model;
    private int size;

    public static class Builder {

        private final Car car = new Car();

        public Builder setColor(String color) {
            car.color = color;
            return this;
        }

        public Builder setModel(String model) {
            car.model = model;
            return this;
        }

        public Builder setSize(int size) {
            car.size = size;
            return this;
        }

        public Car build() {
            return car;
        }

    }
}
