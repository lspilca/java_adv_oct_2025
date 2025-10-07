package com.example.ex3;

public class Ex3 {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Book.class;

        Object book = cls.getDeclaredConstructor().newInstance();

        System.out.println(book.getClass().getSimpleName());

    }
}
