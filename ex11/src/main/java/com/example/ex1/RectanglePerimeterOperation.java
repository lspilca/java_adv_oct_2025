package com.example.ex1;

public class RectanglePerimeterOperation extends RectangleAbstractOperation {

    public RectanglePerimeterOperation(int width, int height) {
        super(width, height);
    }

    @Override
    public double expression() {
        return 2 * (width + height);
    }
}
