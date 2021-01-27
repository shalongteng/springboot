#1、两种配置文件
    yaml
        key：空格value
    properties
        key = value
#2、两种读取配置文件方式
    @value 
        yaml properties
        不支持松散绑定
    @ConfigurationProperties
        yaml
        支持松散绑定
        支持校验
            @Validated + @Email
        
    例子：
        DataSourceProperties
        @ConfigurationProperties(prefix = "spring.datasource")
        源码里有各种各样的Properties结尾的类，都是为了加载 yaml中配置
#3、配置文件的优先级
    file:/config/
    file:/
    classpath:/config/
    classpath:/
#4、配置文件细节
    可以注入属性
    可以使用表达式
    可以使用校验
    多环境配置
        profiles
            active： dev
