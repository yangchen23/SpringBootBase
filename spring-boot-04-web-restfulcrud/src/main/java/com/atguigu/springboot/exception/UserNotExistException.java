package com.atguigu.springboot.exception;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/5/10 18:40
 */
public class UserNotExistException extends RuntimeException{

    public UserNotExistException() {
        super("用户不存在");
    }
}
