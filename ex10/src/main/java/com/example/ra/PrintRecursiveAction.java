package com.example.ra;

import java.util.List;
import java.util.concurrent.RecursiveAction;

public class PrintRecursiveAction extends RecursiveAction {

    private final List<Integer> input;

    public PrintRecursiveAction(List<Integer> input) {
        this.input = input;
    }

    @Override
    protected void compute() {
        if (input.size() < 2) {
            input.forEach(v -> System.out.println(v + " " + Thread.currentThread().threadId())); // Process
        } else {
            int middle = input.size() / 2;

            List<Integer> left = input.subList(0, middle);
            List<Integer> right = input.subList(middle, input.size());

            PrintRecursiveAction printRecursiveAction1 = new PrintRecursiveAction(left);
            PrintRecursiveAction printRecursiveAction2 = new PrintRecursiveAction(right);

            invokeAll(printRecursiveAction1, printRecursiveAction2);
        }
    }
}
