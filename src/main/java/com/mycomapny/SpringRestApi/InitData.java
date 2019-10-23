package com.mycomapny.SpringRestApi;

import com.mycomapny.SpringRestApi.model.Author;
import com.mycomapny.SpringRestApi.model.Book;
import com.mycomapny.SpringRestApi.model.Category;
import com.mycomapny.SpringRestApi.repository.AuthorRepository;
import com.mycomapny.SpringRestApi.repository.BookRepository;
import com.mycomapny.SpringRestApi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");

        final Author author1 = new Author("Andrzej", "Sapkowski");
        final Category category1 = new Category("Sci-Fi");

        Set<Book> bookSet1 = new HashSet<>();

        bookSet1.add(bookRepository.save(new Book("Wiedzmin", LocalDate.now().withYear(1980))));
        bookSet1.add(bookRepository.save(new Book("Wiedzmin2", LocalDate.now().withYear(1980))));
        bookSet1.add(bookRepository.save(new Book("Wiedzmin3", LocalDate.now().withYear(1980))));

        author1.setBookSet(bookSet1);
        category1.setBookSet(bookSet1);
        authorRepository.save(author1);
        categoryRepository.save(category1);

        final Author author2 = new Author("Adam", "Mickiewicz");
        final Category category2 = new Category("Drama");

        Set<Book> bookSet2 = new HashSet<>();
        bookSet2.add(bookRepository.save(new Book("Dziady", LocalDate.now().withYear(1980))));
        bookSet2.add(bookRepository.save(new Book("Balladyna", LocalDate.now().withYear(1980))));
        bookSet2.add(bookRepository.save(new Book("Stepy Akermanskie", LocalDate.now().withYear(1980))));

        author2.setBookSet(bookSet2);
        category2.setBookSet(bookSet2);
        authorRepository.save(author2);
        categoryRepository.save(category2);
    }
}
