package com.mycomapny.SpringRestApi.repository;

import com.mycomapny.SpringRestApi.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    Optional<Author> findById(Long id);

    Author getAuthorByLastname(String lastname);

    Author getAuthorByName(String name);
}
