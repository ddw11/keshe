package com.example.keshe.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.keshe.Service.CarDataService;
import com.example.keshe.entity.CarData;
import com.example.keshe.mapper.CarDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarDataServiceImpl implements CarDataService {

    @Autowired
    CarDataMapper carDataMapper;

    @Override
    public List<CarData> listCarDataEntity() {
        List<CarData> res=new ArrayList<>();
        List<CarData> carDataEntities = carDataMapper.selectList(new QueryWrapper<>());
        System.out.println(carDataEntities.size());
        System.out.println(carDataEntities);
        return carDataEntities;
    }
}
