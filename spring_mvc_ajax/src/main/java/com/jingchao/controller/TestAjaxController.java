package com.jingchao.controller;


import com.jingchao.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestAjaxController {


    @PostMapping("/test/ajax")
    public void testAjax(
            Integer id,
            @RequestBody String  requestBody,
            HttpServletResponse response) throws IOException {
        System.out.println("id = " + id);
        System.out.println("requestBody = " + requestBody);
        response.getWriter().write("hello, axios");
    }

    @PostMapping("/test/RequestBody/json")
    /* public void testRequestBody(@RequestBody User user, HttpServletResponse response) throws IOException {
        System.out.println(user);
        response.getWriter().write("hello,RequestBody");
    } */

    public void testRequestBody(@RequestBody Map<String,Object> map, HttpServletResponse response) throws IOException {
        System.out.println(map);
        response.getWriter().write("hello,RequestBody");
    }



    @RequestMapping("/test/ResponseBody")
    @ResponseBody
    public String testResponseBody(){
        return "success";
    }

    @PostMapping("/test/ResponseBody/json")
    @ResponseBody
    /* public User testResponseBodyJson(){
        User user = new User(1001, "admin", "123456", 18, "男");
        return user;
    } */

    /* public Map<String,Object> testResponseBodyJson(){
        User user1 = new User(10011, "admin", "123456", 18, "男");
        User user2 = new User(10022, "admin", "123456", 18, "男");
        User user3 = new User(10033, "admin", "123456", 18, "男");
        Map<String,Object> map = new HashMap<>();
        map.put("10011",user1);
        map.put("10022",user2);
        map.put("10033",user3);
        return map;
    } */

    public List<User> testResponseBodyJson(){
        User user1 = new User(10011, "admin", "123456", 18, "男");
        User user2 = new User(10022, "admin", "123456", 18, "男");
        User user3 = new User(10033, "admin", "123456", 18, "男");
        List<User> userList = Arrays.asList(user1, user2, user3);
        return userList;
    }

}
