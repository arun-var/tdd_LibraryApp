package com.lib;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;


public class BookTest
{

    @Test(expected =  Exception.class)
    public void nameShouldNotBeNull() throws Exception {
        Book book = new Book(null);
    }

    @Test(expected =  Exception.class)
    public void nameShouldNotBeEmpty() throws Exception {
        Book book = new Book("");
    }

    @Test(expected =  Exception.class)
    public void nameShouldNotBeBlank() throws Exception {
        Book book = new Book("    ");
    }


    @Test
    public void shouldAllowNonEmpty() throws Exception {
        String bookName = "Harry Potter";
        Book book = new Book(bookName);
        Assert.assertThat(book.getName(), Is.is(bookName));
    }
}
