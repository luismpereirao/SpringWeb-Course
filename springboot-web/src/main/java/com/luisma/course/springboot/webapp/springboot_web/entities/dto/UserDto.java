package com.luisma.course.springboot.webapp.springboot_web.entities.dto;

import com.luisma.course.springboot.webapp.springboot_web.entities.User;

public class UserDto {
    private String title;
    private User user;


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
