package com.example.demoaop.annotation;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MethodLog {

    /**
     * 记录操作描述
     */
    String description() default "";

    /**
     * 类型
     */
    Class<?> clazz();

}
