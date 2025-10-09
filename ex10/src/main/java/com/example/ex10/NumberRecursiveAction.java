package com.example.ex10;

import java.util.concurrent.RecursiveAction;

public class NumberRecursiveAction extends RecursiveAction {

    private final int input;

    public NumberRecursiveAction(int input) {
        this.input = input;
    }

    @Override
    protected void compute() {
        if (input < 5) {
            for (int i = 1; i <= input; i++) {
                System.out.println(i);
            }
        } else {
            int mid =  input / 2;

            NumberRecursiveAction left = new NumberRecursiveAction(mid);
            NumberRecursiveAction right = new NumberRecursiveAction(mid);

            left.fork();
            right.compute();

            left.join();

//            invokeAll(left, right);
        }
    }
}
