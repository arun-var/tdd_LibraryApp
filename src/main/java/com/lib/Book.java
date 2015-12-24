package com.lib;

public class Book {


    private final String name;
    private final String isbn;

    public Book(String name, String isbn) throws Exception {

        checkValidity(name, "name");
        checkValidity(isbn, "isbn");


        this.name = name;
        this.isbn = isbn;
    }

    private void checkValidity(String parameter, String prefixMsg) throws Exception {
        if (parameter == null || parameter.trim().length() == 0) {
            throw new Exception(prefixMsg + " should not be null or empty.");
        }
    }

    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }


}