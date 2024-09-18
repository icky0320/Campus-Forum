package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author: 程凯
 * @Package: com.example.config
 * @Project: jwt
 * @Name: WebConfiguration
 * @Date: 2024/9/14  下午9:17
 */
@Configuration
public class WebConfiguration {

    @Bean
    BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
