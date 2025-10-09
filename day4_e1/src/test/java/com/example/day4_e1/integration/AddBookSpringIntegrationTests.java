package com.example.day4_e1.integration;

import com.example.day4_e1.book.exceptions.BookAlreadyExistsException;
import com.example.day4_e1.book.model.Book;
import com.example.day4_e1.book.repository.BookRepository;
import com.example.day4_e1.book.service.BookService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@SpringBootTest
public class AddBookSpringIntegrationTests {

    // 1) Use an in-memory DB (such as H2).
    // 2) Use a real DB but on a test env
    // 3) Use container driven DB such as Testcontainers

    @MockitoBean // @MockBean
    private BookRepository bookRepository;

    @Autowired
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

}
