package com.example.demoaop.controller;

import com.example.demoaop.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Author Gavin
 * @Date 2020/4/5 下午11:21
 **/
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;


    @RequestMapping("/hello")
    public String hello(){
        return helloService.hello();
    }

}

