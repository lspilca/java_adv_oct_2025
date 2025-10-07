package com.example.ex4;

import java.lang.reflect.Method;

public class Ex4 {

    public static void main(String[] args) throws Exception {

        Greeter g = new Greeter();
        Method m = g.getClass().getDeclaredMethod("greet", String.class);
        Object result = m.invoke(g, "Elena");
        System.out.println(result);

    }
}
