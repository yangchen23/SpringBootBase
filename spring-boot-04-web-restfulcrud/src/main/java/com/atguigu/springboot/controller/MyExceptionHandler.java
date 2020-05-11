package com.atguigu.springboot.controller;

import com.atguigu.springboot.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/5/10 18:47
 */

@ControllerAdvice
public class MyExceptionHandler {

//    1、浏览器客户端返回的都是json
//    @ResponseBody
//    @ExceptionHandler(UserNotExistException.class)
//    public Map<String,Object>  handleException(Exception e){
//        Map<String,Object> map = new HashMap<>();
//        map.put("code", "user.notexist");
//        map.put("message", e.getMessage());
//        return map;
//    }

    @ExceptionHandler(UserNotExistException.class)
    public String  handleException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        /**
         * Integer statusCode = (Integer) request
         * .getAttribute("javax.servlet.error.status_code");
         */
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code", "user.notexist");
        map.put("message", e.getMessage());

        request.setAttribute("ext",map);
        //转发到/error
        return "forward:/error";
    }

}
