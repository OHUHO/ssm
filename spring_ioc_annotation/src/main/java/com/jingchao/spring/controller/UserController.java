package com.jingchao.spring.controller;

import com.jingchao.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("controller")
public class UserController {

    @Autowired
    private UserService userService;

    public void savaUser(){
        userService.saveUser();
    };
}
