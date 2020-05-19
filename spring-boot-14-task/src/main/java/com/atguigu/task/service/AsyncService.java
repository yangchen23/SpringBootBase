package com.atguigu.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @version v1.0
 * @Author yangchen
 * @date 2020/5/19 21:01
 * @Description:
 */
@Service
public class AsyncService {

    //告诉Spring 这是一个异步方法
    @Async
    public void hello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("处理数据中...");
    }
}
