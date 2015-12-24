package com.lib;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;


public class BookTest {

    @Test(expected = Exception.class)
    public void nameShouldNotBeNull() throws Exception {
        Book book = new Book(null, "foo");
    }

    @Test(expected = Exception.class)
    public void nameShouldNotBeEmpty() throws Exception {
        Book book = new Book("", "foo'");
    }

    @Test(expected = Exception.class)
    public void nameShouldNotBeBlank() throws Exception {
        Book book = new Book("    ", "foo");
    }


    @Test
    public void nameShouldAllowNonEmpty() throws Exception {
        String bookName = "Harry Potter";
        Book book = new Book(bookName, "foo");
        Assert.assertThat(book.getName(), Is.is(bookName));
    }

    @Test(expected = Exception.class)
    public void isbnShouldNotBeNull() throws Exception {
        Book book = new Book("Bar", null);
    }

    @Test(expected = Exception.class)
    public void isbnShouldNotBeEmpty() throws Exception {
        Book book = new Book("Bar", "");
    }

    @Test(expected = Exception.class)
    public void isbnShouldNotBeBlank() throws Exception {
        Book book = new Book("Bar", "    ");
    }


    @Test
    public void isbnShouldAllowNonEmpty() throws Exception {
        String isbn = "foo";
        Book book = new Book("Bar", isbn);
        Assert.assertThat(book.getIsbn(), Is.is(isbn));
    }
}
