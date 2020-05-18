package com.atguigu.elastic.bean;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @version v1.0
 * @Author yangchen
 * @date 2020/5/18 23:54
 * @Description:
 */
@Document(indexName = "atguigu",indexStoreType = "book")
public class Book {

    private Integer id;
    private String bookName;
    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
