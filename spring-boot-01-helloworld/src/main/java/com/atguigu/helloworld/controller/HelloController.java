package com.atguigu.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/4/27 21:28
 */

/**
 * @ResponseBody + @Controller 相当于 @RestController
 * 请求的数据返回给浏览器
 */
//这个类的所有方法返回的数据直接写给浏览器，（如果是对象转为json格式）
/*@ResponseBody
@Controller*/

@RestController
public class HelloController {

    //@ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
