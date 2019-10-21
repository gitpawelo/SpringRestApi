package com.mycomapny.SpringRestApi.controller;

import com.mycomapny.SpringRestApi.model.Author;
import com.mycomapny.SpringRestApi.repository.AuthorRepository;
import com.mycomapny.SpringRestApi.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AuthorController {

    @Autowired
    private AuthorServiceImpl authorService;


    @GetMapping("/author")
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();
    }


//    @GetMapping("/author/{id}")
//    public ResponseEntity<Author> getAuthorById(
//            @PathVariable(value = "id") Long id){
//        return ResponseEntity
//                .status(HttpStatus.OK)
//                .body(authorService.getAuthorById(id));
//    }


    public Author createAuthor(Author author){
        return authorService.addAuthor(author);
    }


}
