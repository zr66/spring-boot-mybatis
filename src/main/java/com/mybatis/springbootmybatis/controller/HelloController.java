package com.mybatis.springbootmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
@Controller
public class HelloController {
    @Autowired
    JdbcTemplate  jdbcTemplate;
    @ResponseBody
    @GetMapping("/hello")
    public List<Map<String,Object>> hello(){
        List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from tb_area");

        return list;
    }
}
