package com.luisma.course.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luisma.course.springboot.webapp.springboot_web.entities.User;
import com.luisma.course.springboot.webapp.springboot_web.entities.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("Luis Mariano", "Pereira");
        userDto.setUser(user);
        userDto.setTitle("Hello World from Spring Boot!");

        return userDto;
    }

    @GetMapping(path = "/details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("Luis Mariano", "Pereira");
        Map<String, Object> response = new HashMap<>();
        response.put("title", "Hello World from Spring Boot!");
        response.put("user", user);
        return response;
    }
}
