package com.twu.biblioteca.repository;


import com.twu.biblioteca.entity.Book;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


public class BooksRepositoryTest {

    private BooksRepository booksRepository;

    @Before
    public void setUp(){
        this.booksRepository = new BooksRepository();
    }


    @Test
    public void shouldListAllBooks(){

        ArrayList<Book> booksArray = new ArrayList<>();
        booksArray.add(new Book("Lord of the Rings", "J.R.R.Tolkien", 1954, true));
        booksArray.add(new Book("For Whom the Bells Tolls", "Ernest Hemingway", 1915, true));
        booksArray.add(new Book("Harry Potter and the Filosofal Stone", "J.K.Rowling", 2001, true));
        booksArray.add(new Book("Charlie and the Chocolate Factory", "Road Dahl", 1962, true));
        booksArray.add(new Book("Matilda", "Road Dahl", 1964, true));

        assertThat(booksRepository.listAll(), is(booksArray));
    }

    @Test
    public void shouldListAllAvailableBooks(){

        ArrayList<Book> booksArray = new ArrayList<>();
        booksArray.add(new Book("Lord of the Rings", "J.R.R.Tolkien", 1954, true));
        booksArray.add(new Book("For Whom the Bells Tolls", "Ernest Hemingway", 1915, true));
        booksArray.add(new Book("Harry Potter and the Filosofal Stone", "J.K.Rowling", 2001, true));
        booksArray.add(new Book("Charlie and the Chocolate Factory", "Road Dahl", 1962, true));
        booksArray.add(new Book("Matilda", "Road Dahl", 1964, true));

        assertThat(booksRepository.listAllAvailable(), is(booksArray));
    }



}
