package com.mycomapny.SpringRestApi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private Long book_id;

    private String title;

//    @CreatedDate
    private LocalDate year;

    @ManyToOne
    @JoinColumn(name = "author_id")
    @JsonBackReference
    private Author bookAuthor;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    @JsonBackReference
    private Category bookCategory;

    public Book(String title, LocalDate year) {
        this.title = title;
        this.year = year;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public void setBookAuthor(Author bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookCategory(Category bookCategory) {
        this.bookCategory = bookCategory;
    }

    public Long getBook_id() {
        return book_id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getYear() {
        return year;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public Category getBookCategory() {
        return bookCategory;
    }
}
