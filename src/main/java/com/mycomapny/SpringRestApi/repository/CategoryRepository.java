package com.mycomapny.SpringRestApi.repository;

import com.mycomapny.SpringRestApi.model.Book;
import com.mycomapny.SpringRestApi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findById(Long id);

    List<Book> getAllByCategoryName(String categoryName);

}
