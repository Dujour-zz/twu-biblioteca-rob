package com.twu.biblioteca.service;


import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.repository.BooksRepository;

import java.util.Optional;

public class LibraryService {

    private final BooksRepository booksRepository;

    public LibraryService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public void checkout(String title){
        Optional<Book> bookFound = findBook(title);
        bookFound.ifPresent(book -> book.setBookAvailabillity(false));
    }

    public Optional<Book> findBook(String title) {
        return booksRepository.listAll().stream()
                    .filter(book -> book.getTitle().equalsIgnoreCase(title))
                    .findFirst();
    }

    public void returnBook(String title){
        Optional<Book> bookFound = findBook(title);
        bookFound.ifPresent(book -> book.setBookAvailabillity(true));

    }


}
