package com.mycomapny.SpringRestApi.interfaces;

import com.mycomapny.SpringRestApi.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category updateCategory(Category category);
    void deleteCategory(Category category);
}
