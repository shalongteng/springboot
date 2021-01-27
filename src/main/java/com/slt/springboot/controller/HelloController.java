package com.slt.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: springboot
 */
@Controller
public class HelloController {
    /**
     * ssm项目写法
     * 不加ResponseBody 默认返回的是页面 hello.html 页面
     * @return
     */
    @GetMapping("hello")
//    @ResponseBody
    public String hello(){
        return "hello";
    }
}
