package com.twu.biblioteca.service;


import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.repository.BooksRepository;

import java.util.Optional;

public class LibraryService {

    private final BooksRepository booksRepository;

    public LibraryService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public boolean checkout(String title){
        Optional<Book> bookFound = findBook(title);

        boolean returnBoolean = false;
        if(bookFound.isPresent()) {
            bookFound.ifPresent(book -> book.setBookAvailabillity(false));
            returnBoolean =  true;
        }
        return returnBoolean;


    }

    public Optional<Book> findBook(String title) {
        return booksRepository.listAll().stream()
                    .filter(book -> book.getTitle().equalsIgnoreCase(title))
                    .findFirst();
    }

    public boolean returnBook(String title){
        Optional<Book> bookFound = findBook(title);

        boolean returnBoolean = false;
        if(bookFound.isPresent()) {
            bookFound.ifPresent(book -> book.setBookAvailabillity(true));
            returnBoolean =  true;
        }
        return returnBoolean;


    }


}
