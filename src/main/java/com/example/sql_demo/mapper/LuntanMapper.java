package com.example.sql_demo.mapper;

import com.example.sql_demo.entity.Luntan;

import java.util.List;

public interface LuntanMapper {
    void insertLuntan(Luntan luntan);
    void deleteLuntan(Integer id);
    void updateLuntan(Luntan luntan);
    Luntan findById(Integer id);
    List<Luntan> findAll();
}
