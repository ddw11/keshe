package com.example.keshe.mq;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;


@Component
public class Provider {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;




    public void send(String topic,String msg){
        rocketMQTemplate.convertAndSend(topic,msg);
    }
}
