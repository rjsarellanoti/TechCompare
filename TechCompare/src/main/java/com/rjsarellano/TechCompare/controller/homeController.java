package com.rjsarellano.TechCompare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping
public class homeController {


    @RequestMapping({"", "/home", "/"} )
    public String DisplayHomePage(){
        return "home.html";



    }




}
