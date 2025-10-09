package com.example.rt;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SumRecursiveTask extends RecursiveTask<Integer> {

    private final List<Integer> numbers;


    public SumRecursiveTask(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    protected Integer compute() {
        if (numbers.size() < 3) {
            return numbers.stream().reduce(0, Integer::sum);
        }

        int mid =  numbers.size() / 2;

        SumRecursiveTask leftTask = new SumRecursiveTask(numbers.subList(0, mid));
        SumRecursiveTask rightTask = new SumRecursiveTask(numbers.subList(mid, numbers.size()));

        leftTask.fork();

        Integer rightResult = rightTask.compute();
        Integer leftResult = leftTask.join();

        return rightResult + leftResult;
    }
}
