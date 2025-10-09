package com.example.ex2;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;

public class CurrentTimeCallable implements Callable<LocalDateTime> {

    @Override
    public LocalDateTime call() {
        return LocalDateTime.now();
    }
}
