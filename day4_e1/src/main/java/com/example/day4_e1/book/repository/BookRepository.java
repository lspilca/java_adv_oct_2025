package com.example.day4_e1.book.repository;

import com.example.day4_e1.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    boolean existsByIsbn(String isbn);
    Optional<Book> findByIsbn(String isbn);
}
