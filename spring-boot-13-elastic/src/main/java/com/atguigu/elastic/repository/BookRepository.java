package com.atguigu.elastic.repository;

import com.atguigu.elastic.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @version v1.0
 * @Author yangchen
 * @date 2020/5/18 23:53
 * @Description:
 */
public interface BookRepository extends ElasticsearchRepository<Book,Integer> {

    public List<Book> findByBookNameLike(String bookName);
}
