package com.example.day4_e1.book.service;

import com.example.day4_e1.book.exceptions.BookAlreadyExistsException;
import com.example.day4_e1.book.model.Book;
import com.example.day4_e1.book.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookService {

    private final BookRepository bookRepository;

    public BookService(final BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Book addBook(final Book book) {
        final String isbn = book.getIsbn();

        if(bookRepository.existsByIsbn(isbn)) {
            throw new BookAlreadyExistsException("Book already exists " + isbn);
        }

        book.setId(null);

        return bookRepository.save(book);
    }
}
