package com.luisma.course.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.luisma.course.springboot.webapp.springboot_web.entities.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Luis Mariano", "Pereira");
        user.setEmail("luisma@gmail.com");
        model.addAttribute("title", "Details");
        model.addAttribute("header", "Hello World from Spring Boot!");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("title", "Users List");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        return Arrays.asList(
                new User("pepa", "gonzalez"),
                new User("Jhon", "Doe", "jhondoe@gmail.com"),
                new User("Ana", "Roberts"),
                new User("Andrew", "Smith", "andrewsmith@gmail.com"));
    }

}
