package com.mycomapny.SpringRestApi.repository;

import com.mycomapny.SpringRestApi.model.Author;
import com.mycomapny.SpringRestApi.model.Book;
import com.mycomapny.SpringRestApi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findById(Long id);

    Book findByTitle(String title);

    List<Book> getAllByBookCategory(Category category);

    List<Book> getAllByBookAuthor(Author author);
}
