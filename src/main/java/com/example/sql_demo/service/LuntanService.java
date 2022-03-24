package com.example.sql_demo.service;

import com.example.sql_demo.entity.Luntan;

import java.util.List;

public interface LuntanService {
    void addLuntan(Luntan luntan);
    void deleteLuntan(Integer id);
    void updateLuntan(Luntan luntan);
    Luntan findLuntanById(Integer id);
    List<Luntan> findAllLuntan();
}
