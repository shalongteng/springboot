package com.slt.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController
 */
@RestController
public class HelloController2 {
    /**
     * springboot 写法
     * @return
     */
    @GetMapping("hello2")
    public String hello(){
        return "hello2";
    }
}
