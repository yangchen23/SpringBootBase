package com.atguigu.task.controller;

import com.atguigu.task.service.AsyncService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version v1.0
 * @Author yangchen
 * @date 2020/5/19 21:02
 * @Description:
 */
@RestController
public class AsyncController {

    @Resource
    AsyncService asyncService;

    @GetMapping("/hello")
    public String hello() {
        asyncService.hello();
        return "success";
    }
}
