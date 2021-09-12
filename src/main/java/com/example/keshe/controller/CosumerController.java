package com.example.keshe.controller;


import com.example.keshe.mq.MIdObject;
import com.example.keshe.mq.Position;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;



@Component
@RocketMQMessageListener(
        topic = "my-topic2",
        consumerGroup = "ddw1"
)
public class CosumerController implements RocketMQListener<String>{

    @Autowired
    MIdObject mIdObject;

    @Override
    public void onMessage(String str) {
        mIdObject.setStr(str);
        if(mIdObject.getList()==null){
            mIdObject.setList(new ArrayList<>());
        }

        String[] arr=mIdObject.getStr().split(",");
        Position position=new Position();

        position.setX(Integer.parseInt(arr[0]));
        position.setY(Integer.parseInt(arr[1]));

        mIdObject.getList().add(position);
    }
    }





