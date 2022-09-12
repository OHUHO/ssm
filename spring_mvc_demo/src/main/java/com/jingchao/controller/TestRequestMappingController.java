package com.jingchao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
// @RequestMapping("/test")
public class TestRequestMappingController {

    @RequestMapping(
            value = {"/hello","/abc"},
            method = {RequestMethod.GET, RequestMethod.POST},
            // params = {"username","!password","age=20","gender!=男"}
            headers = {"referer"}
    )
    public String hello(){
        return "success";
    }
}
