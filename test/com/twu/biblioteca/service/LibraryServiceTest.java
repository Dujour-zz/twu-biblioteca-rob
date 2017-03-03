package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.repository.BooksRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryServiceTest {

    private LibraryService libraryService;

    @Before
    public void setUp() throws Exception {
        libraryService = new LibraryService(new BooksRepository());
    }


    @Test
    public void shouldSuccessfullyCheckoutBook(){
        libraryService.checkout("Matilda");

        Book expectedBook = libraryService.findBook("Matilda").get();
        assertFalse(expectedBook.getBookAvailabillity());
    }

}