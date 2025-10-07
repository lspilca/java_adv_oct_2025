package com.example.day4_e1.book.service;

import com.example.day4_e1.book.model.Book;
import com.example.day4_e1.book.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {
    private final BookRepository r;
    public BookService(BookRepository r){this.r=r;}

    @Transactional
    public Book add(Book b){
        if(b==null) throw new IllegalArgumentException("x");
        String i = b.getIsbn();
        if(i==null || i.trim().isEmpty()) throw new IllegalArgumentException("i");
        if(r.existsByIsbn(i)) throw new IllegalStateException("dup");
        if(b.getTitle()==null) b.setTitle("");
        b.setId(null);
        return r.save(b);
    }
}
