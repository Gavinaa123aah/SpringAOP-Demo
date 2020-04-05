package com.example.demoaop.aop;

import com.example.demoaop.annotation.MethodLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @ClassName AopAspect
 * @Author Gavin
 * @Date 2020/4/5 下午11:41
 **/
@Aspect
@Component
public class AopAspect {

    @Around(value = "@annotation(methodLog)")
    public Object methodAround(ProceedingJoinPoint joinPoint, MethodLog methodLog) throws Throwable {

        //获得自定义注解的参数
        System.out.println("参数：" + methodLog.description() + " ---clazz：" + methodLog.clazz());

        //执行目标方法，并获得对应方法的返回值
        Object result = joinPoint.proceed();

        System.out.println("返回结果：" + result);

        return result;

    }



}

