package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        System.out.println("BookService Created");
    }

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter Injection Executed");
        this.bookRepository = bookRepository;
    }

    public void displayService() {
        System.out.println("BookService is using -> " + bookRepository);
    }
}
