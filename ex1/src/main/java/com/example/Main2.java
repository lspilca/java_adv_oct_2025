package com.example;

import com.example.dto.Book;

public class Main2 {

    public static void main(String[] args) {

        Object obj = new Book("Book 2", "12345");

        if (obj instanceof Book) {
            Book b = (Book) obj;

            // do smth
        }

        if (obj instanceof Book b) {
            // do smth
        }

        if (obj instanceof Book(String title, _)) {
            // do smth with title
        }

    }
}
