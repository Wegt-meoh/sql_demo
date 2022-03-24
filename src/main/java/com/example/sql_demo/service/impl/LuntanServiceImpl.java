package com.example.sql_demo.service.impl;

import com.example.sql_demo.entity.Luntan;
import com.example.sql_demo.mapper.LuntanMapper;
import com.example.sql_demo.service.LuntanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LuntanServiceImpl implements LuntanService {

    @Autowired
    private LuntanMapper luntanMapper;

    @Override
    public void addLuntan(Luntan luntan) {
        luntanMapper.insertLuntan(luntan);
    }

    @Override
    public void deleteLuntan(Integer id) {
        luntanMapper.deleteLuntan(id);
    }

    @Override
    public void updateLuntan(Luntan luntan) {
        luntanMapper.updateLuntan(luntan);
    }

    @Override
    public Luntan findLuntanById(Integer id) {
        return luntanMapper.findById(id);
    }

    @Override
    public List<Luntan> findAllLuntan() {
        return luntanMapper.findAll();
    }
}
