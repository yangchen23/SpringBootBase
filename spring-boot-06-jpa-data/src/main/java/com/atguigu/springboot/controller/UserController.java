package com.atguigu.springboot.controller;

import com.atguigu.springboot.entity.User;
import com.atguigu.springboot.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version v1.0
 * @Author yangchen
 * @date 2020/5/14 23:00
 * @Description: CRUD
 */
@RestController
public class UserController {

    @Resource
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userRepository.getOne(id);
        return user;
    }

    @GetMapping("/user")
    public User insertUser(User user){
        User save = userRepository.save(user);
        return save;
    }

}
