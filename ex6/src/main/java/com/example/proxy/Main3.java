package com.example.proxy;

public class Main3 {

    public static void main(String[] args) {

        MyService myService = MyService.getInstance(); // proxee
        MyServiceProxy myServiceProxy = new MyServiceProxy(myService);

        Object o = "HELLO";

//        myService.doSomething(o);
        myServiceProxy.doSomething(o);
    }
}
