package com.jingchao.spring.test;

import com.jingchao.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    @Test
    public void testIOC(){
        // 获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        // 获取bean
        Student studentOne = (Student) ioc.getBean("studentOne");
        System.out.println(studentOne);


    }
}
