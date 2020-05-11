package com.atguigu.springboot.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/5/10 19:04
 */
//给容器中加入我们自己的ErrorAttributes
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {

    //返回的map就是页面和json能返回的所有字段
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> map = super.getErrorAttributes(webRequest, includeStackTrace);
        map.put("company","atguigu");

        //我们的异常处理器携带的数据
        Map<String,Object> ext = (Map<String,Object>)webRequest.getAttribute("ext", 0);
        map.put("ext",ext);
        return map;
    }
}
