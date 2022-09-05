package com.jingchao.spring.test;

import com.jingchao.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    @Test
    public void testScope(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");
        Student student = ioc.getBean(Student.class);
        Student student1 = ioc.getBean(Student.class);
        System.out.println(student == student1);

    }
}
