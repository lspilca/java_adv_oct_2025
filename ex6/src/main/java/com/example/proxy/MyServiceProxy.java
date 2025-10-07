package com.example.proxy;

public class MyServiceProxy {

    private final MyService myService;

    public MyServiceProxy(MyService myService) {
        this.myService = myService;
    }

    public void doSomething(Object obj) {
        myService.doSomething(String.valueOf(obj));
    }
}
