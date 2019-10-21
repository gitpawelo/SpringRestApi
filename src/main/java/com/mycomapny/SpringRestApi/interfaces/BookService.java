package com.mycomapny.SpringRestApi.interfaces;

import com.mycomapny.SpringRestApi.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();
    Book addBook(Book book);
    Book updateBook(Book book);
    void deleteBook(Book book);
    }
