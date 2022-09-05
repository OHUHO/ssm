package com.jingchao.spring.test;

import com.jingchao.spring.controller.UserController;
import com.jingchao.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByXMLTest {

    @Test
    public void testAutowire(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController controller = ioc.getBean(UserController.class);
        controller.saveUser();
    }
}
