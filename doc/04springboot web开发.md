#1、idea 热部署插件JRebel
    1、安装JRebel
    ​		（1）在IDEA中一次点击 File->Settings->Plugins->Brows Repositories
    ​		（2）找到JRebel for intellij
    2、激活JRebel
       ​		（1）生成一个GUID：https://www.guidgen.com/
       ​		（2）根据反向代理服务器地址拼接激活地址： https://jrebel.qekang.com/{GUID}
       ​		（3）打开JRebel激活面板，选择Connect to online licensing service.
       ​		（4）点击work offline
    3 springboot 项目多加的配置
        https://blog.csdn.net/ting1king/article/details/109503013
        
        edit configurations
            update classes and resource
#2、springboot整合servlet、filter、listener
        整合servlet、
            1、编写servlet类
        ​    2、在启动类上添加如下配置，将自定义的servlet添加到springboot容器中,
                @ServletComponentScan
                
                @Bean
                public ServletRegistrationBean<MyServlet> getServletRegistrationBean(){
                    ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<>(new MyServlet());
                    bean.setLoadOnStartup(1);
                    return bean;
                }
        整合filter，
        
        整合listener。
            listener是servlet规范定义的一种特殊类，用于监听servletContext,HttpSession
            和ServletRequest等域对象的创建和销毁事件。监听域对象的属性发生修改的事件，
            用于在事件发生前、发生后做一些必要的处理。可用于以下方面：
                1、统计在线人数和在线用户
                2、系统启动时加载初始化信息
                3、统计网站访问量
                4、记录用户访问路径。
        
        
#3、静态资源的配置
    默认配置：
    ​   Spring Boot 将在 classpath 或者 ServletContext 根目录下从名为 
        /static （/public、/resources 或 /META-INF/resources）目录中服务静态内容。
    手动配置静态路径：
        它使用了 Spring MVC 的 ResourceHttpRequestHandler，因此您可以通过添加自己的 
        WebMvcConfigurerAdapter 并重写 addResourceHandlers 方法来修改此行为。
    webjars：
        前端打成了jar包
        在pom文件中添加jquery的相关依赖，直接可以通过浏览器访问到
        http://localhost:8080/webjars/jquery/3.4.1/jquery.js
    template目录访问
        需要添加模板引擎 thymeleaf包
        
#4、thymeleaf模板引擎的使用
    