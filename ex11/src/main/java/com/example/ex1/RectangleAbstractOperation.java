package com.example.ex1;

public abstract class RectangleAbstractOperation implements Operation {

    protected final int width;
    protected final int height;

    public RectangleAbstractOperation(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

