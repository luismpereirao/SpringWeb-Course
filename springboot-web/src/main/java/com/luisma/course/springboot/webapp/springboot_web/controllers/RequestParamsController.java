package com.luisma.course.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luisma.course.springboot.webapp.springboot_web.entities.dto.ParamDto;
import com.luisma.course.springboot.webapp.springboot_web.entities.dto.ParamMixDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {
    @GetMapping("/foo")
    public ParamDto getMethodName(
            @RequestParam(required = false, defaultValue = "Hola que tal", name = "mensaje") String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam() Integer code) {
        ParamMixDto params = new ParamMixDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }

}
