package com.jingchao.spring.test;

import com.jingchao.spring.aop.annotation.Calculator;
import com.jingchao.spring.aop.annotation.LoggerAspect;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

    @Test
    public void testAOPAnnotation(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(12,3);
    }
}
