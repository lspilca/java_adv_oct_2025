package com.example.ex12;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SortNumbersRecursiveTask extends RecursiveTask<List<Integer>> {

    private final List<Integer> input;

    public SortNumbersRecursiveTask(List<Integer> input) {
        this.input = input;
    }

    @Override
    protected List<Integer> compute() {
        if (input.size() <= 1) {
            return input;
        }

        int mid =  input.size() / 2;

        List<Integer> left = input.subList(0, mid); // [0, mid)
        List<Integer> right = input.subList(mid, input.size()); // [mid, size)

        SortNumbersRecursiveTask leftTask = new SortNumbersRecursiveTask(left);
        SortNumbersRecursiveTask rightTask = new SortNumbersRecursiveTask(right);

        leftTask.fork();

        List<Integer> rightSorted = rightTask.compute();
        List<Integer> leftSorted = leftTask.join();

        return merge(leftSorted, rightSorted);
    }

    // [3,7,10]   [1,2,4]
    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> list = new ArrayList<>(left.size() + right.size());

        int i = 0; int j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                list.add(left.get(i++));
            } else {
                list.add(right.get(j++));
            }
        }


        while( i < left.size()) {list.add(left.get(i++));}
        while( j < right.size()) {list.add(right.get(j++));}

        return list;
    }
}
