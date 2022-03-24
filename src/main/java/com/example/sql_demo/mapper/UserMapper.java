package com.example.sql_demo.mapper;

import com.example.sql_demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    void insertUser(User user);
    void deleteUser(Integer id);
    User selectUser(Integer id);
    void updateUser(User user);
    List<User> selectAll();
}
