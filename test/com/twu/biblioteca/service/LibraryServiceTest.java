package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.repository.BooksRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryServiceTest {

    @Test
    public void shouldSuccessfullyCheckoutBook(){
        LibraryService libraryService = new LibraryService(new BooksRepository());

        libraryService.checkout("Matilda");


        Book expectedBook = libraryService.findBook("Matilda").get();
        assertFalse(expectedBook.getBookAvailabillity());
    }

    @Test
    public void shouldSuccessfullyReturnBook(){
        LibraryService libraryService = new LibraryService(new BooksRepository());

        Book expectedBook = libraryService.findBook("Lord of the Rings").get();
        assertEquals(expectedBook.getBookAvailabillity(), false);

        libraryService.returnBook("Lord of the Rings");

        assertTrue(expectedBook.getBookAvailabillity());

    }

    @Test
    public void shouldNotBeSuccessfullyReturned(){
        LibraryService libraryService = new LibraryService(new BooksRepository());

        Book expectedBook = libraryService.findBook("Matilda").get();
        assertEquals(expectedBook.getBookAvailabillity(), true);

        libraryService.returnBook("Matilda");
        assertTrue(expectedBook.getBookAvailabillity());

    }


    @Test
    public void shouldNotBeSuccessfullyCheckedOut(){
        LibraryService libraryService = new LibraryService(new BooksRepository());

        Book expectedBook = libraryService.findBook("Lord of the Rings").get();
        assertEquals(expectedBook.getBookAvailabillity(), false);

        libraryService.checkout("Lord of the Rings");
        assertFalse(expectedBook.getBookAvailabillity());


    }

}
