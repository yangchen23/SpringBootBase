package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * SpringBoot单元测试
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入等功能
 */
@SpringBootTest
class SpringBoot02ConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
