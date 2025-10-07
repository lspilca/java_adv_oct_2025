package com.example.ex2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex2 {

    public static void main(String[] args) {

        Class<?> cls = Book.class;

        Field[] fields = cls.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Show.class)) {
                Show show = field.getAnnotation(Show.class);
                for (int i=0; i<show.value(); i++) {
                    System.out.println(field.getName());
                }
            }
        }

        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            method.setAccessible(true);
            if (method.isAnnotationPresent(Show.class)) {
                Show show = method.getAnnotation(Show.class);
                for (int i=0; i<show.value(); i++) {
                    System.out.println(method.getName());
                }
            }
        }

    }
}
