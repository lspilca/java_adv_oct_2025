package com.example.ex5;

import java.lang.reflect.Field;

public class Ex5 {

    public static void main(String[] args) throws Exception {

        User u = new User();

        Field f = u.getClass().getDeclaredField("name");
        f.setAccessible(true);
        f.set(u, "Alex");

        System.out.println(u.getName());
    }
}
