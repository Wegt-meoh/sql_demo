package com.example.sql_demo.service.impl;

import com.example.sql_demo.entity.Book;
import com.example.sql_demo.mapper.BookMapper;
import com.example.sql_demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public void addBook(Book book) {
        bookMapper.insertBook(book);
    }

    @Override
    public void deleteBook(Integer id) {
        bookMapper.deleteBook(id);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }

    @Override
    public Book findBookById(Integer id) {
        return bookMapper.findById(id);
    }

    @Override
    public List<Book> findAllBook() {
        return bookMapper.findAll();
    }
}
