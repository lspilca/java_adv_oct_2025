package com.example.ex7;

public class Ex7 {

    static double area(Shape s) {
        return switch (s) {
            case Circle c -> Math.PI * c.r * c.r;
            case Rectangle r -> r.w * r.h;
            default -> 0;
        };
    }

}
