package com.twu.biblioteca.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Before
    public void initialize(){

    }

    @Test
    public void shouldGetCorrectBookTitle() { // shouldGetCorrectBookName
        Book expectedOne = new Book("Neverwere", "Neil Gaiman", 2004, true);
        assertEquals( expectedOne.getTitle(), "Neverwere" );
    }
}
