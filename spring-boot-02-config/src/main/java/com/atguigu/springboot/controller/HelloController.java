package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/4/27 23:48
 */

@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello "+ name;
    }
}
