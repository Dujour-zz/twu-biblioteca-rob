package com.twu.biblioteca;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.repository.BooksRepository;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("The library is oficially open! Welcome! \n And don't forget: Reading is FUNdamental ;)");
        BooksRepository br = new BooksRepository();

        for(Book book: br.listAll()){ //specific for for lists applied to the problem
            System.out.println(book.toString());
        }
    }
}
