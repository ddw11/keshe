package com.example.keshe.controller;
import com.alibaba.fastjson.JSON;
import com.example.keshe.Service.CarDataService;
import com.example.keshe.entity.CarData;
import com.example.keshe.mq.MIdObject;
import com.example.keshe.mq.PidObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




import java.util.List;

@Controller
public class CarDataController {

    @Autowired
    CarDataService carDataService;

    @Autowired
    CosumerController cosumerController;

    @Autowired
    MIdObject mIdObject;

    @Autowired
    PidObject pidObject;

    @Autowired
    ProducerController producerController;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/selectList")
    public String selectList(Model model) {
        List<CarData> list = carDataService.listCarDataEntity();
        model.addAttribute("carDataList",list);

        return "carData1";
    }

    @GetMapping("/deleteAll")
    public String deleteAll(){
        carDataService.deleteAll();
        return "success";
    }


    @RequestMapping("/huabu")
    public String getHuaBu(Model model){

        String s = JSON.toJSONString(mIdObject.getList());
        System.out.println(s);
        model.addAttribute("list",s);
        //System.out.println(mIdObject.getList()+"ddw111");
       return "huabu";
    }


    @RequestMapping("/PID")
    public String temp(){
        return "pid";
    }



   @RequestMapping ("/pid")
    public String pid(String p,String i,String d){
        pidObject.setP(p);
        pidObject.setI(i);
        pidObject.setD(d);
       String s = JSON.toJSONString(pidObject);
       producerController.send("my-topic3",s);
       System.out.println(s);

        return "success";
    }


}
