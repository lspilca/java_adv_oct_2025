package com.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodRunnable implements Runnable {

    private final Method method;

    public MethodRunnable(Method method) {
        this.method = method;
    }

    @Override
    public void run() {
        try {
            Object target = method.getDeclaringClass().getDeclaredConstructor().newInstance();
            method.invoke(target);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
