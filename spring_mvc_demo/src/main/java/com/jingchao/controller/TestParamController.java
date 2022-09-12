package com.jingchao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestParamController {

    @RequestMapping("/param/servletAPI")
    public String getParamByServletAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username: "+username+ "  password: "+password);

        return "success";
    }

    @RequestMapping("/param")
    public String getParam(
            @RequestParam(value = "username",defaultValue = "hello") String username,
            @RequestParam("password") String password,
            @RequestHeader("referer") String referer
    ){
        System.out.println("username: "+username+ "  password: "+password);
        System.out.println("referer = " + referer);
        return "success";
    }

}
