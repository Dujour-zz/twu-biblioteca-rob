package com.twu.biblioteca.repository;

import com.twu.biblioteca.entity.Book;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BooksRepository {

    private final ArrayList<Book> books;

    public BooksRepository() {
        ArrayList<Book> booksArray = new ArrayList<>();
        booksArray.add(new Book("Lord of the Rings", "J.R.R.Tolkien", 1954, false));
        booksArray.add(new Book("For Whom the Bells Tolls", "Ernest Hemingway", 1915, true));
        booksArray.add(new Book("Harry Potter and the Filosofal Stone", "J.K.Rowling", 2001, true));
        booksArray.add(new Book("Charlie and the Chocolate Factory", "Road Dahl", 1962, true));
        booksArray.add(new Book("Matilda", "Road Dahl", 1964, true));
        this.books = booksArray;
    }

    public ArrayList<Book> listAll() {
        return this.books;
    }

    public ArrayList<Book> listAllAvailable() {
        ArrayList<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookAvailabillity()) {
                availableBooks.add(book);
            }

        }
        return availableBooks;
    }

}