package com.example.ex7;

import java.lang.reflect.Method;

public class Ex7 {

    public static void main(String[] args) throws Exception {
        Tasks t = new Tasks();
        for (Method m : Tasks.class.getDeclaredMethods()) {
            m.setAccessible(true);
            if (m.isAnnotationPresent(RunMe.class)) {
                m.invoke(t);
            }
        }

    }
}
