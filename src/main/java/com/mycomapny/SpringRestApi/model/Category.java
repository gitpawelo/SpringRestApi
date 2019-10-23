package com.mycomapny.SpringRestApi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long category_id;

    private String categoryName;

    @JsonManagedReference
    @OneToMany
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Set<Book> bookSet = new HashSet<>();

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }
}
