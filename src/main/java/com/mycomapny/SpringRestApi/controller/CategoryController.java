package com.mycomapny.SpringRestApi.controller;

import com.mycomapny.SpringRestApi.model.Category;
import com.mycomapny.SpringRestApi.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryService;

    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
}
