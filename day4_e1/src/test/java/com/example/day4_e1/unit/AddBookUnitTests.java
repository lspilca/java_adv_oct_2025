package com.example.day4_e1.unit;


import com.example.day4_e1.book.exceptions.BookAlreadyExistsException;
import com.example.day4_e1.book.model.Book;
import com.example.day4_e1.book.repository.BookRepository;
import com.example.day4_e1.book.service.BookService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AddBookUnitTests {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;


    @Test
    @DisplayName("""
            GIVEN an ISBN
            WHEN the ISBN already exists for a book in the database
            THEN throw an exception
            """)
    void test1() {
        Book book = new Book();
        book.setIsbn("123456789");

        when(bookRepository.existsByIsbn(book.getIsbn())).thenReturn(true);

        assertThrows(
                BookAlreadyExistsException.class,
                () -> bookService.addBook(book)
        );

    }


    @Test
    @DisplayName("""
            GIVEN an ISBN
            WHEN the ISBN doesn't exist for a book in the database
            THEN save the book record
            AND return the book
            """)
    void test2() {
        Book book = new Book();
        book.setIsbn("123456789");
        book.setTitle("title");

        Book savedBook = new Book();
        savedBook.setId(1L);
        savedBook.setIsbn("123456789");
        savedBook.setTitle("title");

        when(bookRepository.existsByIsbn(book.getIsbn())).thenReturn(false);
        when(bookRepository.save(book)).thenReturn(savedBook);

        Book result = bookService.addBook(book);

        assertEquals(savedBook, result);

        verify(bookRepository, times(1)).existsByIsbn(book.getIsbn());
        verify(bookRepository, times(1)).save(book);
    }

}
