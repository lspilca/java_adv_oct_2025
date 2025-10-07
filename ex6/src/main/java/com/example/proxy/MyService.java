package com.example.proxy;

public class MyService {

    private MyService() {}

    private static class SingletonHolder {
        private static final MyService INSTANCE = new MyService();
    }

    public static MyService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void doSomething(String input) {
        System.out.println(input);
    }
}
