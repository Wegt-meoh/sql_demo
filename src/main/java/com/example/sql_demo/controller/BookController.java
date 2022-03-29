package com.example.sql_demo.controller;

import com.example.sql_demo.entity.Book;
import com.example.sql_demo.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping("/findAll")
    private List<Book> findAll(){
        return bookService.findAllBook();
    }

    @RequestMapping("/addBook/{bookName}/{bookDesc}/{bookPrice}/{bookReserve}/{bookAuthor}")
    private void addBook(@PathVariable("bookName") String bookName,
                    @PathVariable("bookDesc") String bookDesc,
                    @PathVariable("bookPrice") float bookPrice,
                    @PathVariable("bookReserve") Integer bookReserve,
                    @PathVariable("bookAuthor") String bookAuthor){

        bookService.addBook(new Book(null,bookName,bookDesc,bookPrice,bookReserve,bookAuthor));
    }

    @RequestMapping("/find/{id}")
    private Book findById(@PathVariable("id") Integer id){
        return bookService.findBookById(id);
    }

    @RequestMapping("/delete/{id}")
    private void deleteById(@PathVariable("id") Integer id){
        bookService.deleteBook(id);
    }

    @RequestMapping("update/{id}/{bookName}/{bookDesc}/{bookPrice}/{bookReserve}/{bookAuthor}")
    private void updateBook(
         @PathVariable("id") Integer id,
         @PathVariable("bookName") String bookName,
         @PathVariable("bookDesc") String bookDesc,
         @PathVariable("bookPrice") float bookPrice,
         @PathVariable("bookReserve") Integer bookReserve,
         @PathVariable("bookAuthor") String bookAuthor){
        bookService.updateBook(new Book(id,bookName,bookDesc,bookPrice,bookReserve,bookAuthor));
    }

}
