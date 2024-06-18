package com.example.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.webservice.model.User;


import ch.qos.logback.core.model.Model;

@Controller
public class PageController {

    @GetMapping("/profile")
    public String profile(Model model) {
        
        return "userProfile";
    }
    
}
