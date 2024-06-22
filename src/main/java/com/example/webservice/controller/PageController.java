package com.example.webservice.controller;

import com.example.webservice.model.User;
import com.example.webservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PageController {

    @Autowired
    private UserService userService;

    @GetMapping("/profile/{id}")
    public String profile(@PathVariable Long id, Model model) {
        User user = userService.findById(id).orElse(null);
        model.addAttribute("user", user);  
        //return a table with the user records for the id.     
        return "userProfile";
    }   
    
    @GetMapping("/user/{id}")
    public String showRegistrationForm(@PathVariable Long id, Model model) {
        User user = userService.findById(id).orElse(null);
        model.addAttribute("user", user);
        //return a form for re-registration of the user records for the id.   
        return "updateRegistration";
    }

    @PostMapping("/update")
    public String registerUser(@ModelAttribute("user") User user, Model model) {
        userService.update(user);
        //Return to login page
        return "redirect:/login";
    }
}
