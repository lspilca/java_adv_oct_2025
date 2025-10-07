package com.example.ex8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

class LoggingHandler implements InvocationHandler {

    private final Object target;
    private int calls = 0;

    LoggingHandler(Object target) {
        this.target = target;
    }

    int calls() { return calls; }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Entering method: " + method.getName() + " " +  Arrays.toString(args));
        calls++;
        return target.getClass().getMethod(method.getName(), method.getParameterTypes()).invoke(target, args);
    }
}
