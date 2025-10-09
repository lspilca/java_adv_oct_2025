package com.example.ex1;

public class RectangleAreaOperation extends RectangleAbstractOperation {

    public RectangleAreaOperation(int width, int height) {
        super(width, height);
    }

    @Override
    public double expression() {
        return width * height;
    }
}
