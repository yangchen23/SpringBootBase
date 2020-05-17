package com.atgugu.cache;

import com.atgugu.cache.bean.Employee;
import com.atgugu.cache.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class SpringBoot11CacheApplicationTests {

    @Resource
    EmployeeMapper employeeMapper;

    @Resource
    StringRedisTemplate stringRedisTemplate; //操作字符串的

    @Resource
    RedisTemplate redisTemplate; //k-v都是对象的

    @Resource
    RedisTemplate<Object, Object> empRedisTemplate;

    /**
     * String(字符串)、List(列表)、Set(集合)、Hash(散列)、ZSet(有序集合)
     * stringRedisTemplate.opsForValue()【String(字符串)】
     * stringRedisTemplate.opsForList()【List(列表)】
     * stringRedisTemplate.opsForSet()【Set(集合)】
     * stringRedisTemplate.opsForHash()【Hash(散列)】
     * stringRedisTemplate.opsForZSet()【ZSet(有序集合)】
     */
    @Test
    public void test01(){
        //给redis中保存数据
        //stringRedisTemplate.opsForValue().append("msg","hello");
//        String msg = stringRedisTemplate.opsForValue().get("msg");
//        System.out.println(msg);

        stringRedisTemplate.opsForList().leftPush("mylist","1");
        stringRedisTemplate.opsForList().leftPush("mylist","2");
    }

    @Test
    public void test02(){
        Employee empById = employeeMapper.getEmpById(1);
        //默认如果保存对象，使用jdk序列化机制，序列化后的数据保存到redis中
//        redisTemplate.opsForValue().set("emp-01",empById);
        //1、将数据以json的对象保存
            // (1)自己将对象转为json
            // (2)redisTemplate默认的序列化规则
        empRedisTemplate.opsForValue().set("emp-01",empById);
    }

    @Test
    void contextLoads() {
        Employee empById = employeeMapper.getEmpById(1);
        System.out.println(empById);
    }

}
