package com.example.keshe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/hq_ddw")
    public String test1()
    {
        return "test1";
    }

}
