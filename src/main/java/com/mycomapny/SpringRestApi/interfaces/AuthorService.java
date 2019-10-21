package com.mycomapny.SpringRestApi.interfaces;

import com.mycomapny.SpringRestApi.model.Author;

import java.util.List;

public interface AuthorService {

    List<Author> getAllAuthors();
    Author addAuthor(Author author);
    Author updateAuthor(Author author);
    void deleteAuthor(Author author);
}
