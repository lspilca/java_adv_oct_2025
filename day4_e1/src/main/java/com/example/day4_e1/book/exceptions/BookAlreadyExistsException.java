package com.example.day4_e1.book.exceptions;

public class BookAlreadyExistsException extends RuntimeException{

    public BookAlreadyExistsException(final String message) {
        super(message);
    }
}
