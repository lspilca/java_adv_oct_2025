package com.example;

import com.example.dto.Book;

public class Main7 {

    public static void main(String[] args) {

        Object obj = new Book("Title", "12234");


        switch (obj) {
            case Book(String title, _) -> System.out.println(title);
//            case Book(_, String isbn) ->  System.out.println(isbn);
//            case Book(_,_) -> System.out.println(":)");
            case Book b -> System.out.println(b);
            default -> System.out.println("");
        }

    }
}
