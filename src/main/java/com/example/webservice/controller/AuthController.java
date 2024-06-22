package com.example.webservice.controller;

import com.example.webservice.model.User;
import com.example.webservice.repository.UserRepository;
import com.example.webservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class AuthController {

    @Autowired
    private UserService userService;
    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        return "login";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    //registration submission
    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user, Model model) {
        //validation of registration by email
        if (userService.findByEmail(user.getEmail()).isPresent()) {
            model.addAttribute("error", "Email already in use");
            return "register";
        }
    
        else userService.save(user);

        //Code viewer for debugging
        System.out.println(user);

        //Return to login page
        return "redirect:/login";
    }

    //login submission
    @PostMapping("/login")
    public String login(@RequestParam("username") String email, @RequestParam("password") String password, Model model) {
        User user = userRepository.findByEmail(email).orElse(null);
        if (user != null && bCryptPasswordEncoder.matches(password, user.getPassword())) {
            // Authentication successful
            model.addAttribute("firstName", user.getFirstName());
            model.addAttribute("lastName", user.getLastName());
            return "redirect:/welcome";
        } else {
            // Authentication failed
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }
    }
   
}

