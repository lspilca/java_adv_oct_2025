package com.example.ex9;

import java.util.concurrent.RecursiveAction;

public class PrintThreadNameRecursiveAction extends RecursiveAction {

    @Override
    protected void compute() {
        System.out.println("Task executed" + Thread.currentThread().getName());
    }
}
