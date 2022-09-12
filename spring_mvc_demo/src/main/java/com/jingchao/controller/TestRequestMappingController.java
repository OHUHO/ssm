package com.jingchao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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


    @RequestMapping("/a?a/test/ant")
    public String testAnt(){
        return "success";
    }

    @RequestMapping("/test/rest/{username}/{id}")
    public String testRest(@PathVariable("username") String username, @PathVariable("id") Integer id){
        System.out.println(username);
        System.out.println(id);
        return  "success";
    }
}
