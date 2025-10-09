package com.example.ex1;

public interface Operation {

    double expression();

    static Operation build(final Type type, final int... values) {
        return switch (type) {
            case CIRCLE_AREA -> new CircleAreaOperation(values[0]);
            case RECTANGLE_AREA -> new RectangleAreaOperation(values[0], values[1]);
            case RECTANGLE_PERIMETER -> new RectanglePerimeterOperation(values[0], values[1]);
        };
    }
}
