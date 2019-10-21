package com.mycomapny.SpringRestApi.service;

import com.mycomapny.SpringRestApi.interfaces.CategoryService;
import com.mycomapny.SpringRestApi.model.Book;
import com.mycomapny.SpringRestApi.model.Category;
import com.mycomapny.SpringRestApi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Optional<Category> getById(Long id){
        return  categoryRepository.findById(id);
    }

    public List<Book> getAllByCategoryName(String categoryName){
        return categoryRepository.getAllByCategoryName(categoryName);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Category category) {
        categoryRepository.delete(category);
    }
}
