package com.example.ex2;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

public class RandomNumberCallable implements Callable<Integer> {

    @Override
    public Integer call() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt();
    }
}
