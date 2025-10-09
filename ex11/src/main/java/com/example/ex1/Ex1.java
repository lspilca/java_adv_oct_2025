package com.example.ex1;

public class Ex1 {

    public static void main(String[] args) {
        Operation operation = Operation.build(Type.CIRCLE_AREA, 10);

        Calculator calculator = new Calculator();
        double result = calculator.calculate(operation);

        System.out.println(result);
    }
}
