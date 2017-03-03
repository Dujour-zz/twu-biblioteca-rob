package com.twu.biblioteca.repository;

import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BooksRepository {

    private final List<Book> books;

    public BooksRepository (){
        ArrayList<Book> booksArray = new ArrayList<>();
        booksArray.add(new Book("Lord of the Rings", "J.R.R.Tolkien", 1954, true));
        booksArray.add(new Book("For Whom the Bells Tolls", "Ernest Hemingway", 1915, true));
        booksArray.add(new Book("Harry Potter and the Filosofal Stone", "J.K.Rowling", 2001, true));
        booksArray.add(new Book("Charlie and the Chocolate Factory", "Road Dahl", 1962, true));
        booksArray.add(new Book("Matilda", "Road Dahl", 1964, true));
        this.books = booksArray;
    }

    public List<Book> listAll(){
        return this.books;
    }
}
