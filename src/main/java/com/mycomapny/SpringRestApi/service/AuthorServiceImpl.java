package com.mycomapny.SpringRestApi.service;

import com.mycomapny.SpringRestApi.interfaces.AuthorService;
import com.mycomapny.SpringRestApi.model.Author;
import com.mycomapny.SpringRestApi.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author getAuthorById( Long id){
        Optional<Author>author =authorRepository.findById(id);
        if (author.isPresent()){
            return author.get();
        }else {
            System.out.println("nie ma takiego autora!");
        }
        return author.get();
    }

    public Optional<Author> findById(Long id){

        return authorRepository.findById(id);
    }

    public Author getAuthorByLastname(String lastname){
        return authorRepository.getAuthorByLastname(lastname);
    }

    public Author getAuthorByName(String name){
        return authorRepository.getAuthorByName(name);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(Author author) {
        authorRepository.delete(author);
    }


}
