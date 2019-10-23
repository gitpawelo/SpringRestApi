package com.mycomapny.SpringRestApi.controller;

import com.mycomapny.SpringRestApi.model.Author;
import com.mycomapny.SpringRestApi.repository.AuthorRepository;
import com.mycomapny.SpringRestApi.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/author/{id}")
    public ResponseEntity<Author> getAuthorById(
            @PathVariable(value = "id") Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(authorService.getAuthorById(id));
    }

    @GetMapping("author/name/{name}")
    public ResponseEntity<Author> getAuthorByName( @PathVariable(value = "name") String name){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(authorService.getAuthorByName(name));
    }

    @GetMapping("author/lastname/{lastname}")
    public ResponseEntity<Author> getAuthorByLastname( @PathVariable(value = "lastname") String lastname){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(authorService.getAuthorByLastname(lastname));
    }

    @DeleteMapping("author/{id}")
    public ResponseEntity<Author> deleteAuthorById( @PathVariable (value = "id") Long id){
        Author author = authorService.getAuthorById(id);
            if (author == null){
                return ResponseEntity.notFound().build();
            }else
                authorService.deleteAuthor(author);
            return ResponseEntity.ok(author);
    }

    public Author createAuthor(Author author){
        return authorService.addAuthor(author);
    }


}
