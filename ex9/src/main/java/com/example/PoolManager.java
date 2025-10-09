package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolManager {

    private final ExecutorService executorService;

    public PoolManager() {
        executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

    private static final class SingletonHolder {
        private static final PoolManager INSTANCE = new PoolManager();
    }

    public static PoolManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void addTask(MethodRunnable task) {
        executorService.submit(task);
    }

    public void shutdown() {
        executorService.close();
    }
}
