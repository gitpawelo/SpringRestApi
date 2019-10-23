package com.mycomapny.SpringRestApi.exception;

public class AuthorNotFoundException extends RuntimeException{
    public AuthorNotFoundException(Long id) {
        super("Could not found author with following id: " + id);
    }
}
