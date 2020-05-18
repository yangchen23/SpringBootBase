package com.atguigu.elastic;

import com.atguigu.elastic.bean.Article;
import com.atguigu.elastic.bean.Book;
import com.atguigu.elastic.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import javax.annotation.Resource;

@SpringBootTest
class SpringBoot13ElasticApplicationTests {

    @Resource
    ElasticsearchTemplate elasticsearchTemplate;

    @Resource
    BookRepository bookRepository;

    @Test
    public void test02(){
        Book book = new Book();
        book.setId(1);
        book.setBookName("西游记");
        book.setAuthor("吴承恩");
        bookRepository.index(book);

        /*for (Book book : bookRepository.findByBookNameLike("游")) {
            System.out.println(book);
        }
        ;*/
    }

    @Test
    void contextLoads() {
        //1、给Es中索引(保存)一个文档；
        Article article = new Article();
        article.setId(1);
        article.setTitle("好消息");
        article.setAuthor("zhangsan");
        article.setContent("Hello World");
//        elasticsearchTemplate.index()
    }

}
