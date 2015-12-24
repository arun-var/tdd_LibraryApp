package com.lib;

public class Book{


    private final String name;

    public Book(String name) throws Exception {

        if(name == null || name.trim() == "") {
            throw new Exception("Name should not be null or empty.");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }
}