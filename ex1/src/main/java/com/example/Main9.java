package com.example;

import com.example.enums.Type;

public class Main9 {

    public static void main(String[] args) {

        String x = "";
        Type type = Type.A;

        int z = switch (x) {
            case "1" -> 10;
            default -> 0;
        };


        int y =  switch (type) {
            case A -> 10;
            case B -> 20;
        };

    }
}
