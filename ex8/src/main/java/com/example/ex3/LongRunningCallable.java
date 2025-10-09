package com.example.ex3;

import java.time.Duration;
import java.util.concurrent.Callable;

public class LongRunningCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(Duration.ofSeconds(5));
        return "Done";
    }
}
