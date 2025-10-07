package com.example.ex1;

public class Ex1 {


    public static void main(String[] args) {
        Object obj = new Person();

        Class<?> cls = obj.getClass();
        System.out.println(cls.getCanonicalName());
        System.out.println(cls.getSimpleName());
        System.out.println(cls.getPackageName());

    }
}
