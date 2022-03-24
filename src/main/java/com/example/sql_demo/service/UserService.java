package com.example.sql_demo.service;

import com.example.sql_demo.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(Integer id);
    User selectUser(Integer id);
    void updateUser(User user);
    List<User> findAll();
}
