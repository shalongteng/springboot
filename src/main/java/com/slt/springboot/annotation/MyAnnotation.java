package com.slt.springboot.annotation;

import java.lang.annotation.*;

/**
 * 四个元注解
 */
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotation {

    String name () default "slt";
}

class Test{
    @MyAnnotation
    private String name;
}