package com.example.day4_e1.book.controller;

import com.example.day4_e1.book.exceptions.BookAlreadyExistsException;
import com.example.day4_e1.book.service.BookService;
import com.example.day4_e1.book.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(final BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<?> addBook(@RequestBody final Book book){
        try{
            if(book == null) throw new IllegalArgumentException("This endpoint requests a request body");
            if(book.getIsbn() == null || book.getIsbn().trim().isEmpty()) throw new IllegalArgumentException("Book's ISBN should not be null");

            final Book createdBook = bookService.addBook(book);

            return ResponseEntity.status(HttpStatus.CREATED).body(createdBook);
        } catch(IllegalStateException e) {
            return ResponseEntity.status(409).build();
        } catch(IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        } catch (BookAlreadyExistsException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
