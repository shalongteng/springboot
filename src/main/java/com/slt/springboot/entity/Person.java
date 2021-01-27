package com.slt.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

//import javax.validation.constraints.Email;
import java.util.List;

/**
 * @Description:
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
//会将person 属性 依次注入
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {

// 如果是properties配置文件，就必须使用@value 注入
//    @Value("${person.name}")

//    @Email
    private String lastName;
    @Value("#{1+2}")
    private Integer age;
    private String sex;
//    @Value("${person.likes}")
    private List<String> likes;



}
