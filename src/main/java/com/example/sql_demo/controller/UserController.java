package com.example.sql_demo.controller;

import com.example.sql_demo.entity.User;
import com.example.sql_demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/index")
    public String index(){
        return "Hello world";
    }

    @RequestMapping("/findAll")
    public List<User> findAll(){
        System.out.println("find all");
        return userService.findAll();
    }

    @RequestMapping("/addUser/{id}/{name}/{age}")
    public void addUser(@PathVariable("id") int id,@PathVariable("name") String name,@PathVariable("age") int age){
        User user = new User(id, name, age);
        userService.addUser(user);
    }

    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable("id")int id){
        System.out.println("get user");
        return userService.selectUser(id);
    }
}
