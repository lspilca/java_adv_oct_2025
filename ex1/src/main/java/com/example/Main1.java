package com.example;


import com.example.dto.Book;

public class Main1 {
    public static void main(String[] args) {
        Book book = new Book("Book 1", "12345");

        System.out.println(book.title());
    }
}
