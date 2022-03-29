package com.example.sql_demo.mapper;

import com.example.sql_demo.entity.Book;

import java.util.List;

public interface BookMapper {
    void insertBook(Book book);
    void deleteBook(Integer id);
    void updateBook(Book book);
    Book findById(Integer id);
    List<Book> findAll();
}
