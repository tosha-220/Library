package com.netcraker.dao;


import com.netcraker.model.Book;

import java.util.List;

public interface BookDao {
    void addBook(Book book);

    void updateBook(Book book);

    void deleteBook(int id);

    Book getBookById(int id);

    List<Book> listBooks();

    List<Book> getBookByName(String name);
}
