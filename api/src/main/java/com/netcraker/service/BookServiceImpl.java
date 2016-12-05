package com.netcraker.service;

import com.netcraker.dao.BookDao;
import com.netcraker.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Transactional
    @Override
    public void addBook(Book book) {
        this.bookDao.addBook(book);
    }

    @Transactional
    @Override
    public void updateBook(Book book) {
        this.bookDao.updateBook(book);
    }

    @Transactional
    @Override
    public void deleteBook(int id) {
        this.bookDao.deleteBook(id);
    }

    @Transactional
    @Override
    public Book getBookById(int id) {
        return this.bookDao.getBookById(id);
    }

    @Transactional
    @Override
    public List<Book> listBooks() {
        return this.bookDao.listBooks();
    }

    @Transactional
    @Override
    public List<Book> getBookByName(String name) {
        return this.bookDao.getBookByName(name);
    }
}
