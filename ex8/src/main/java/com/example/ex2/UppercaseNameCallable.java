package com.example.ex2;

import java.util.concurrent.Callable;

public class UppercaseNameCallable implements Callable<String> {

    private final String name;

    public UppercaseNameCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() {
        return name.toUpperCase();
    }
}
