package com.jingchao.spring.test;

import com.jingchao.spring.controller.UserController;
import com.jingchao.spring.dao.UserDao;
import com.jingchao.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByAnnotationTest {

    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController controller = ioc.getBean("controller",UserController.class);
        /* System.out.println(controller);

        UserService service = ioc.getBean(UserService.class);
        System.out.println(service);

        UserDao dao = ioc.getBean(UserDao.class);
        System.out.println(dao); */
        controller.savaUser();

    }

}
