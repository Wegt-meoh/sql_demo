package com.example.sql_demo.service;

import com.example.sql_demo.entity.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    void deleteBook(Integer id);
    void updateBook(Book book);
    Book findBookById(Integer id);
    List<Book> findAllBook();
}
