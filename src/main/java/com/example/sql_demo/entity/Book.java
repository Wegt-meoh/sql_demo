package com.example.sql_demo.entity;

public class Book {
    private Integer id;
    private String bookName;
    private String bookDesc;
    private float bookPrice;
    private Integer bookReserve;
    private String bookAuthor;

    public Book(Integer id, String bookName, String bookDesc, float bookPrice, Integer bookReserve, String bookAuthor) {
        this.id = id;
        this.bookName = bookName;
        this.bookDesc = bookDesc;
        this.bookPrice = bookPrice;
        this.bookReserve = bookReserve;
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookDesc='" + bookDesc + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookReserve=" + bookReserve +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getBookReserve() {
        return bookReserve;
    }

    public void setBookReserve(Integer bookReserve) {
        this.bookReserve = bookReserve;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
