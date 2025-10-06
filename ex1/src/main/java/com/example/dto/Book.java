package com.example.dto;

//public final class Book {
//
//    private final String title;
//
//    public Book(String title) {
//        this.title = title;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//}


public record Book(String title, String isbn) {
}
