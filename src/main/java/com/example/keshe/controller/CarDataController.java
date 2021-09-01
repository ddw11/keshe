package com.example.keshe.controller;

import com.example.keshe.Service.CarDataService;
import com.example.keshe.entity.CarData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CarDataController {

    @Autowired
    CarDataService carDataService;

    @RequestMapping("/selectList")
    public String selectList(Model model) {
        List<CarData> list = carDataService.listCarDataEntity();
        model.addAttribute("carDataList",list);
        return "carData";
    }
}
