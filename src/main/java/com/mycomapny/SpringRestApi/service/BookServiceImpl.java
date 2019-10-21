package com.mycomapny.SpringRestApi.service;

import com.mycomapny.SpringRestApi.interfaces.BookService;
import com.mycomapny.SpringRestApi.model.Author;
import com.mycomapny.SpringRestApi.model.Book;
import com.mycomapny.SpringRestApi.model.Category;
import com.mycomapny.SpringRestApi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public Optional<Book> findById(Long id){
        return bookRepository.findById(id);
    }

    public Book getBookByTitle(String title){
        return bookRepository.findByTitle(title);
    }

    public List<Book> getAllBooksByCategoryName(Category category){
        return bookRepository.getAllByBookCategory(category);
    }

    public List<Book> getAllByBookAuthor(Author author){
        return bookRepository.getAllByBookAuthor(author);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }
}
