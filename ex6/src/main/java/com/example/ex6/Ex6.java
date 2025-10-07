package com.example.ex6;

import java.lang.reflect.Method;

public class Ex6 {

    public static void main(String[] args) throws Exception {
        Calc c = new Calc();

        Method m = c.getClass().getDeclaredMethod("compute", int.class, int.class);
        m.setAccessible(true);

        Object out = m.invoke(c, 1, 2);

        System.out.println(out);
    }
}
