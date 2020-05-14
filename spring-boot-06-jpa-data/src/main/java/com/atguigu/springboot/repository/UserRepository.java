package com.atguigu.springboot.repository;

import com.atguigu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @version v1.0
 * @Author yangchen
 * @date 2020/5/14 22:49
 * @Description: 继承JpaRepository来完成对数据库的操作
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
