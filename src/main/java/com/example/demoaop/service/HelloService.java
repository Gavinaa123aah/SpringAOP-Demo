package com.example.demoaop.service;

import com.example.demoaop.annotation.MethodLog;
import org.springframework.stereotype.Service;

/**
 * @ClassName HelloService
 * @Author Gavin
 * @Date 2020/4/5 下午11:21
 **/

@Service
public class HelloService {



    @MethodLog(description = "hello function", clazz = HelloService.class)
    public String hello(){
        return "hello world";
    }
}

