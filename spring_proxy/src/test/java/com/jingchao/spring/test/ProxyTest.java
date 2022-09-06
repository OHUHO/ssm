package com.jingchao.spring.test;

import com.jingchao.spring.proxy.Calculator;
import com.jingchao.spring.proxy.CalculatorImpl;
import com.jingchao.spring.proxy.CalculatorStaticProxy;
import com.jingchao.spring.proxy.ProxyFactory;
import org.junit.Test;

public class ProxyTest {

    @Test
    public  void testProxy(){
        /* CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        proxy.add(2,4); */

        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(2,4);

    }
}
