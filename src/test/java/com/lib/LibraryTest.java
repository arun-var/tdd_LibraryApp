package com.lib;


import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by techops on 24/12/15.
 */
public class LibraryTest {

    @Test
    public void FindByNameWithNullSearchString() throws Exception {

        Library lib = new Library();
        List<Book> searchBookResult = lib.search("");

        Assert.assertNotNull(searchBookResult);
        Assert.assertThat(searchBookResult, Is.is(new ArrayList<Book>()));
    }

    @Test
    public void FindByNameWithResults() throws  Exception
    {

        Library lib = new Library();
        String searchTerm = "Harry potter 1";

        List<Book> books = lib.search(searchTerm);

        Assert.assertNotNull(books);
        Assert.assertThat(books.size(), Is.is(1));
        Assert.assertThat(books.get(0).getName(), Is.is(searchTerm));
    }
}
