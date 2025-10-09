package com.example.ex2;

import com.example.ex1.SumCalculatorCallable;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex2 {

    public static void main(String[] args) {
        try (ExecutorService es = Executors.newSingleThreadExecutor()) {
            Future<LocalDateTime> f1 = es.submit(new CurrentTimeCallable());
            Future<Integer> f2 = es.submit(new RandomNumberCallable());
            Future<String> f3 = es.submit(new UppercaseNameCallable("john"));

            LocalDateTime time = f1.get();
            Integer result = f2.get();
            String name = f3.get();

            System.out.println(time);
            System.out.println(result);
            System.out.println(name);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
