package com.atgugu.cache.service;

import com.atgugu.cache.bean.Department;
import com.atgugu.cache.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @version v1.0
 * @Author yangchen
 * @date 2020/5/17 20:49
 * @Description:
 */
@Service
public class DeptService {

    @Resource
    DepartmentMapper departmentMapper;

    @Autowired
    CacheManager cacheManager;

//    @Cacheable(cacheNames = "dept")
//    public Department getDeptById(Integer id){
//        System.out.println("查询部门"+id);
//        Department department = departmentMapper.getDeptById(id);
//        return department;
//    }

    //使用缓存管理器得到缓存，进行api调用即可
    public Department getDeptById(Integer id){
        System.out.println("查询部门"+id);
        Department department = departmentMapper.getDeptById(id);

        //获取某个缓存
        Cache dept = cacheManager.getCache("dept");
        dept.put("dept:1",department);

        return department;
    }
}
