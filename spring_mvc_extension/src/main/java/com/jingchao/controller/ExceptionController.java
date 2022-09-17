package com.jingchao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ExceptionController {

    // 设置要处理的异常信息
    @ExceptionHandler(ArithmeticException.class)
    public String handlerException(Throwable ex, Model model){
        // ex表示控制器方法出现的异常
        model.addAttribute("ex",ex);
        return "error";
    }

}
