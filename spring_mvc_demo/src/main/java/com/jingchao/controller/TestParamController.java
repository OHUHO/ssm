package com.jingchao.controller;

import com.jingchao.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class TestParamController {

    @RequestMapping("/param/servletAPI")
    public String getParamByServletAPI(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username: "+username+ "  password: "+password);

        return "success";
    }

    @RequestMapping("/param")
    public String getParam(
            @RequestParam(value = "username",defaultValue = "hello") String username,
            @RequestParam("password") String password,
            @RequestHeader("referer") String referer,
            @CookieValue("JSESSIONID") String jsessionId
    ){
        System.out.println("username: "+username+ "  password: "+password);
        System.out.println("referer = " + referer);
        System.out.println("jsessionId = " + jsessionId);
        return "success";
    }


    @RequestMapping("/param/pojo")
    public String getParamPojo(User user){
        System.out.println("user = " + user);
        return "success";

    }

}
