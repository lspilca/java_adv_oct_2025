package com.example.ex8;

import java.lang.reflect.Proxy;

public class ProxyExercise {
    public static void main(String[] args) {
        Greeter real = new GreeterImpl();

        LoggingHandler handler = new LoggingHandler(real);
        Greeter proxy = (Greeter) Proxy.newProxyInstance(
                Greeter.class.getClassLoader(),
                new Class[] {Greeter.class},
                handler);

        System.out.println(proxy.greet("Elena"));
        System.out.println(proxy.greet("Alex"));

        System.out.println("Calls: " + handler.calls());
    }
}

