package com.atguigu.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/5/10 19:47
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter process...");
        chain.doFilter(request, response);
    }
}
