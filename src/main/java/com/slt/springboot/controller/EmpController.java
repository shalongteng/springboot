package com.slt.springboot.controller;

import com.slt.springboot.mult.DataSource;
import com.slt.springboot.mult.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class EmpController {

    @GetMapping("/selectEmp")
    @DataSource(value = DataSourceType.LOCAL)
    public String selectEmp(){
        return "ok";
    }

}