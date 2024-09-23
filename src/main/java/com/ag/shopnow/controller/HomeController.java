package com.ag.shopnow.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")

    public String greeting(){
        return "Welcome to ShopNow!";
    }
    @RequestMapping("/about")
    public String about(){
        return "Hi there it's AG from ShopNow!";
    }
}
