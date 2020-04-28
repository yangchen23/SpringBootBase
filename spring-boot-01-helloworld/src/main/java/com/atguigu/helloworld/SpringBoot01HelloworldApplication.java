package com.atguigu.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot项目
 */
@SpringBootApplication
public class SpringBoot01HelloworldApplication {

    public static void main(String[] args) {

        // Spring应用启动起来
        SpringApplication.run(SpringBoot01HelloworldApplication.class, args);
    }

}
