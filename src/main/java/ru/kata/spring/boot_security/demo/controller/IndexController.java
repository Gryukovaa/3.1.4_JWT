package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/login")
    public String mainPage(){
        return "/login";
    }

    @GetMapping("/t")
    public String returnTest(){
        return "/test";
    }

}
