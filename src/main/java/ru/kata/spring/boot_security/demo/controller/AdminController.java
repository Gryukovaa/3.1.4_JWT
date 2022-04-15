package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping()
    public String showAdminHtml(){
        System.out.println("запустился админ контроллер");
        return "/newDesign/all_users";
    }
}