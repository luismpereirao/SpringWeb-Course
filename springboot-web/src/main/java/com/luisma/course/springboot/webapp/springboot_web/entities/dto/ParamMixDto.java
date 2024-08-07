package com.luisma.course.springboot.webapp.springboot_web.entities.dto;

public class ParamMixDto {
    private String message;
    private Integer code;

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
