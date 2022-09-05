package com.jingchao.spring.test;

import com.jingchao.spring.pojo.Person;
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
        // Student student = (Student) ioc.getBean("studentOne");
        // Student student = ioc.getBean(Student.class);
        // Student student = ioc.getBean("studentOne", Student.class);
        Person person = ioc.getBean(Person.class);

        System.out.println(person);
    }

    @Test
    public void testDI(){
        // 获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        // 获取bean
        // Student student = ioc.getBean("studentTwo", Student.class);
        // Student student = ioc.getBean("studentThree", Student.class);
        // Student student = ioc.getBean("studentSix", Student.class);
        // Student student = ioc.getBean("studentSeven", Student.class);
        // Student student = ioc.getBean("studentEight", Student.class);
        Student student = ioc.getBean("studentNine", Student.class);
        System.out.println(student);
    }

}
