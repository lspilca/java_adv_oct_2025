package com.example.ex1;

import java.util.concurrent.Callable;
import java.util.stream.IntStream;

public class SumCalculatorCallable implements Callable<Integer> {

    private final Integer rightIntervalLimit;

    public SumCalculatorCallable(Integer rightIntervalLimit) {
        this.rightIntervalLimit = rightIntervalLimit;
    }

    @Override
    public Integer call() {
        return IntStream.range(0, rightIntervalLimit).sum();
    }
}
