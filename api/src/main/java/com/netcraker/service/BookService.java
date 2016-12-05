package com.netcraker.service;

import com.netcraker.model.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);

    void updateBook(Book book);

    void deleteBook(int id);

    Book getBookById(int id);

    List<Book> listBooks();

    List<Book> getBookByName(String name);
}
