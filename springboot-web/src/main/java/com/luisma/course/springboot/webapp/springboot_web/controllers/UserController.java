package com.luisma.course.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.luisma.course.springboot.webapp.springboot_web.entities.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Luis Mariano", "Pereira");
        model.addAttribute("title", "Details");
        model.addAttribute("header", "Hello World from Spring Boot!");
        model.addAttribute("user", user);
        return "details";
    }
}
