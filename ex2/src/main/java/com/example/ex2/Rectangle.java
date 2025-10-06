package com.example.ex2;

public record Rectangle (int w, int h) {

    public Rectangle {
        if (w <= 0 || h <= 0) throw new IllegalArgumentException("positive only");
    }

    public int area() { return w * h; }

}
