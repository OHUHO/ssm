package com.jingchao.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LoggerAspect {


    public void beforeAdviceMethod(JoinPoint joinPoint){
        // 获取连接点对应的方法的签名信息
        Signature signature = joinPoint.getSignature();
        // 获取连接点对应方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect, 方法 " + signature.getName() + "，参数：" + Arrays.toString(args));
    }

    public void afterAdviceMethod(JoinPoint joinPoint){
        // 获取连接点对应的方法的签名信息
        Signature signature = joinPoint.getSignature();
        // 获取连接点对应方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect, 方法 " + signature.getName()+"，执行完毕");
    }

    public void afterReturningAdviceMethod(JoinPoint joinPoint, Object result){
        // 获取连接点对应的方法的签名信息
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect, 方法 "+signature.getName() + "，结果："+ result);
    }

    public void afterThrowAdviceMethod(JoinPoint joinPoint, Exception exception){
        // 获取连接点对应的方法的签名信息
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect, 方法 "+signature.getName()+"，异常: " + exception);
    }

    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint){
        Object result = null;
        try {
            System.out.println("环绕通知 ——> 前置通知");
            // 表示目标对象方法的执行
            result = joinPoint.proceed();
            System.out.println("环绕通知 ——> 返回通知");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知 ——> 异常通知");
        }finally {
            System.out.println("环绕通知 ——> 后置通知");
        }
        return result;
    }

}
