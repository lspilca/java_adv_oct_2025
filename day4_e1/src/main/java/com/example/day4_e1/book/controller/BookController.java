package com.example.day4_e1.book.controller;

import com.example.day4_e1.book.service.BookService;
import com.example.day4_e1.book.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService s;
    public BookController(BookService s){this.s=s;}

    @PostMapping
    public ResponseEntity<?> add(@RequestBody Book b){
        try{
            Book x = s.add(b);
            return ResponseEntity.status(HttpStatus.CREATED).body(x);
        }catch(IllegalStateException e){
            return ResponseEntity.status(409).build();
        }catch(IllegalArgumentException e){
            return ResponseEntity.badRequest().build();
        }
    }
}
