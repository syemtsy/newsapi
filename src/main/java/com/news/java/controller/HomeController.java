package com.news.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by symetsy on 19-12-30
 **/
@RestController
public class HomeController {
    @RequestMapping(value = "/test")
    public String test(){
        return "test success";
    }
}
