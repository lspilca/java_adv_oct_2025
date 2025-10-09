package com.example.ex1;

public class CircleAreaOperation implements Operation {

    private static final double PI = 3.14;

    private final double radius;

    public CircleAreaOperation(double radius) {
        this.radius = radius;
    }

    @Override
    public double expression() {
        return radius * radius * PI;
    }
}
