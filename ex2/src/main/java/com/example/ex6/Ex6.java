package com.example.ex6;

public class Ex6 {

    static String quadrant1(Object o) {
        return switch (o) {
            case Point(int x, int y) when x >=0 && y >= 0 -> "Q1";
            case Point(int x, int y) when x <0 && y >= 0 -> "Q2";
            case Point(int x, int y) when x < 0 && y < 0 -> "Q3";
            case Point(int x, int y) when x >=0 && y < 0 -> "Q4";
            default -> "unknown";
        };
    }


    static String quadrant2(Object o) {
        return switch (o) {
            case Point p when p.x() >=0 && p.y() >= 0 -> "Q1";
            // ----
            default -> "unknown";
        };
    }

}
