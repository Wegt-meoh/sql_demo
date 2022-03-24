package com.example.sql_demo.controller;


import com.example.sql_demo.entity.Luntan;
import com.example.sql_demo.service.LuntanService;
import com.example.sql_demo.service.impl.LuntanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/luntan")
public class LuntanController {
    @Autowired
    private LuntanServiceImpl luntanService;

    @RequestMapping("/search/{id}")
    public Luntan searchById(@PathVariable("id") Integer id){
        return luntanService.findLuntanById(id);
    }

    @RequestMapping("/findAll")
    public List<Luntan> searchAll(){
        return luntanService.findAllLuntan();
    }

    @RequestMapping("/add/{title}/{content}")
    public void addLuntan(@PathVariable("title") String title,@PathVariable("content") String content){
        luntanService.addLuntan(new Luntan(title,content));
    }

    @RequestMapping("delete/{id}")
    public void deleteLuntan(@PathVariable("id") Integer id){
        luntanService.deleteLuntan(id);
    }
}
