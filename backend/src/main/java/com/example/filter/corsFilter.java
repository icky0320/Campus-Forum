package com.example.filter;

import com.example.utils.Const;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Author: 程凯
 * @Package: com.example.filter
 * @Project: jwt
 * @Name: corsFilter
 * @Date: 2024/9/16  上午9:58
 */
@Component
@Order(Const.ORDER_CORS)
public class corsFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request,
                            HttpServletResponse response,
                            FilterChain chain) throws IOException, ServletException {
        this.addCorsHeader(request,response);
        chain.doFilter(request,response);
    }

    private void addCorsHeader(HttpServletRequest request,
                               HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.addHeader("Access-Control-Allow-Headers", "Authorization, Content-Type");

    }
}
