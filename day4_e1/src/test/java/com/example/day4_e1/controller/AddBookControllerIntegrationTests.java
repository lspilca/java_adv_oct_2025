package com.example.day4_e1.controller;

import com.example.day4_e1.book.model.Book;
import com.example.day4_e1.book.repository.BookRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class AddBookControllerIntegrationTests {

    @MockitoBean
    private BookRepository bookRepository;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    // TEST -> (Jackson) -> Controller -> MockService
    // TEST -> (Jackson) -> Controller -> Service -> MockRepo
    // TEST -> (Jackson) -> Controller -> Service -> Repo -> DB (Testcontainers)
    //                                            -> Proxy -> StubPaymentsService (Wiremock)

    @Test
    @DisplayName("""
            GIVEN you call the POST /book endpoint with a book
            WHEN the book's ISBN already exists in the database
            THEN HTTP status should be 400 Bad Request
            """)
    public void test1() throws Exception {
        Book book = new Book();
        book.setIsbn("123456789");
        book.setTitle("Title");

        when(bookRepository.existsByIsbn(book.getIsbn())).thenReturn(true);

        mockMvc.perform(post("/book")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(book)))
                .andExpect(status().isBadRequest())
                .andExpect(content().string(""));

    }


    @Test
    @DisplayName("""
            GIVEN a call to the POST /book endpoint with a book
            WHEN the provided book's ISBN doesn't exist for a book in the database
            THEN save the book record
            AND expect the book back with and ID and a 201 CREATED HTTP status
            """)
    public void test2() throws Exception {
        Book book = new Book();
        book.setIsbn("123456789");
        book.setTitle("Title");

        Book savedBook = new Book();
        savedBook.setId(1L);
        savedBook.setIsbn("123456789");
        savedBook.setTitle("Title");

        when(bookRepository.existsByIsbn(book.getIsbn())).thenReturn(false);
        when(bookRepository.save(book)).thenReturn(savedBook);

        mockMvc.perform(post("/book")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(book)))
                .andExpect(status().isCreated())
                .andExpect(content().string(objectMapper.writeValueAsString(savedBook)));
    }

}
