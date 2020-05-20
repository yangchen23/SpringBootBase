package com.atguigu.deploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @version v1.0
 * @Author yangchen
 * @date 2020/5/20 22:26
 * @Description:
 */
@Controller
public class HelloController {

    @GetMapping("/abc")
    public String hello(){
        return "hello";
    }
}
