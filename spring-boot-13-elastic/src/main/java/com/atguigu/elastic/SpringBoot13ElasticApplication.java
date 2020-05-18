package com.atguigu.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot默认支持两种技术来和ES交互
 * 1、Rest
 * 2、SpringData ElasticSearch
 *      ElasticsearchRestTemplate
 *      编写一个ElasticsearchRepository的子接口来操作ES
 *      两种用法：https://docs.spring.io/spring-data/elasticsearch/docs/3.2.6.RELEASE/reference/html/#elasticsearch.operations.template
 *  *  1）、编写一个 ElasticsearchRepository
 */
@SpringBootApplication
public class SpringBoot13ElasticApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot13ElasticApplication.class, args);
    }

}
