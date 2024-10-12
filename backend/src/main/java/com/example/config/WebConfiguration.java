package com.example.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: 程凯
 * @Package: com.example.config
 * @Project: jwt
 * @Name: WebConfiguration
 * @Date: 2024/9/14  下午9:17
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Bean
    BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }

//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/api/**")  // 允许的路由
//                .allowedOrigins("http://localhost:5173")  // 允许的源
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // 允许的方法
//                .allowedHeaders("*")  // 允许的头部
//                .allowCredentials(true);  // 允许发送凭证
//    }
}
