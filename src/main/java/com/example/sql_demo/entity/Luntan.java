package com.example.sql_demo.entity;

public class Luntan {
    private String title;
    private Integer id;
    private String content;

    public Luntan(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Luntan( Integer id,String title, String content) {
        this.title = title;
        this.id = id;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Luntan{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", content='" + content + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
