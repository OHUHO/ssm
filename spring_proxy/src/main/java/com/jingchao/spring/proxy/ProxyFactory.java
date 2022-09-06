package com.jingchao.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy(){

        ClassLoader classLoader = target.getClass().getClassLoader();

        Class<?>[] interfaces = target.getClass().getInterfaces();

        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    // proxy代理对象    method要执行的方法    args 要执行的方法用到的参数列表
                    System.out.println("[日志] "+ method.getName()+" 方法开始了，参数是：" + Arrays.toString(args));
                    result = method.invoke(target, args);
                    System.out.println("[日志] "+ method.getName()+" 方法结束了，结果是：" + result);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("[日志] "+ method.getName()+" 异常" + e);
                } finally {
                    System.out.println("[日志] "+ method.getName()+" 方法执行完毕");
                }

                return result;
            }
        };


        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
}
