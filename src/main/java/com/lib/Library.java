package com.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by techops on 24/12/15.
 */
public class Library {

    List<Book> books = new ArrayList<Book>();

    public Library() throws Exception {

        Book harryPotter1 = new Book("Harry potter 1", "HP1");
        Book harryPotter2 = new Book("Harry potter 2", "HP1");
        Book harryPotter3 = new Book("Harry potter 3", "HP1");

        books.add(harryPotter1);
        books.add(harryPotter2);
        books.add(harryPotter3);
    }

    public List<Book> search(String s) {

        if(s == null || s.trim().length() == 0) {
            return new ArrayList<>();
        }

        return books.stream().filter(e -> e.getName().equals(s)).collect(Collectors.toList());
    }
}
