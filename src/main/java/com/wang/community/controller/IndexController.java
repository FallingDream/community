package com.wang.community.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@SuppressWarnings("all")
@Controller
public class IndexController {

    @GetMapping("/")
    public String hello(){
        return "index";
    }
}
