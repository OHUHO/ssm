package com.jingchao.spring.controller;

import com.jingchao.spring.service.UserService;

public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void  saveUser(){
        userService.saveUser();
    }
}
