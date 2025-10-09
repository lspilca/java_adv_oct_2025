package com.example.ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex1 {

    public static void main(String[] args) {
        try (ExecutorService es = Executors.newSingleThreadExecutor()) {
            Future<Integer> future = es.submit(new SumCalculatorCallable(11));

            Integer res = future.get();

            System.out.println(res);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
