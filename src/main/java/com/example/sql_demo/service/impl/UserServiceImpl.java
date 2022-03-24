package com.example.sql_demo.service.impl;

import com.example.sql_demo.entity.User;
import com.example.sql_demo.mapper.UserMapper;
import com.example.sql_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }

    @Override
    public User selectUser(Integer id) {
        return userMapper.selectUser(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }
}
