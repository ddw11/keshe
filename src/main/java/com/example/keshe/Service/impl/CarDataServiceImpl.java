package com.example.keshe.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.keshe.Service.CarDataService;
import com.example.keshe.entity.CarData;
import com.example.keshe.mapper.CarDataMapper;
import com.example.keshe.mq.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarDataServiceImpl implements CarDataService {

    @Autowired
    CarDataMapper carDataMapper;

    @Autowired
    Provider provider;





    @Override
    public List<CarData> listCarDataEntity() {
        List<CarData> res=new ArrayList<>();
        List<CarData> carDataEntities = carDataMapper.selectList(new QueryWrapper<>());

//        User user=new User();
//        user.setName("ddw");
//        user.setAge(12);
//        provider.send("my-topic",user);


       // provider.send("my-topic2","123,456");

        return carDataEntities;
    }

    @Override
    public void deleteAll() {
        carDataMapper.deleteAll();
    }


}
