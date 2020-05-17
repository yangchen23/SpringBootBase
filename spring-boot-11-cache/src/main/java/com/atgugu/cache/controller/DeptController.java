package com.atgugu.cache.controller;

import com.atgugu.cache.bean.Department;
import com.atgugu.cache.service.DeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version v1.0
 * @Author yangchen
 * @date 2020/5/17 20:53
 * @Description:
 */
@RestController
public class DeptController {

    @Resource
    DeptService deptService;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id){
        return deptService.getDeptById(id);
    }
}
