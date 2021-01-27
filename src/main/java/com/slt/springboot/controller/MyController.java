package com.slt.springboot.controller;

import com.slt.springboot.entity.Person;
import com.slt.springboot.filter.MyHttpSessionListener;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class MyController {
    @RequestMapping("hello3")
    public String hello(Model model,HttpSession session){
        session.setAttribute("aa","aa");
        model.addAttribute("msg","hello,Springboot");
        return "hello";
    }

    @RequestMapping("online")
    @ResponseBody
    public String online(){
        return "当前在线人数："+ MyHttpSessionListener.online +"人";
    }

    @RequestMapping("thymeleaf")
    public String thymeleaf(ModelMap map,HttpSession session){
        session.setAttribute("name","zhangsan");
        map.put("thText","th:text设置文本内容 <b>加粗</b>");
        map.put("thUText","th:utext 设置文本内容 <b>加粗</b>");
        map.put("thValue","thValue 设置当前元素的value值");
        map.put("thEach","Arrays.asList(\"th:each\", \"遍历列表\")");
        map.put("thIf","msg is not null");
        map.put("thObject",new Person());
        return "thymeleaf";
    }


    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
