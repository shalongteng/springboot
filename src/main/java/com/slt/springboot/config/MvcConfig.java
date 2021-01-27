package com.slt.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    /**
     * setViewName("/test")是你HTML或JSP页面名称   test.html或test.jsp
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/msb").setViewName("hello");
        registry.addViewController("/login.html").setViewName("login");
    }

}
