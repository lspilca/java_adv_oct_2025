package com.example.sw;

public class Ex {


    public static void main(String[] args) {
        Object o = new Book("Title", "12345");

        switch (o) {
            case Book(_, String isbn) -> System.out.println(isbn);
            case Book b ->  System.out.println(b);
            default -> System.out.println(o);
        }

//        switch (o) {
//            case Book(_, String isbn) -> System.out.println(isbn);
//            case Book(String title, _) ->  System.out.println(title);
//            default -> System.out.println(o);
//        }

    }
}
