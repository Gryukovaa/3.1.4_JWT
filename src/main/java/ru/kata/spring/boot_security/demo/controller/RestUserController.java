package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserService;

@RestController
@RequestMapping("/users/u")
public class RestUserController {
    private UserService userService;

    @Autowired
    public RestUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<User> showById() {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        // получаем юзера из аутентификации, для верхней навиг панели
        // а также для заполнения его деталями таблички юзера

        System.out.println(auth.getName());
        System.out.println(userService.findByUsername(auth.getName()));
        return new ResponseEntity<>(userService.findByUsername(auth.getName()), HttpStatus.OK);
    }
}
