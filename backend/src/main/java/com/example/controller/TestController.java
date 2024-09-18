package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 程凯
 * @Package: com.example.controller
 * @Project: jwt
 * @Name: TestController
 * @Date: 2024/9/14  下午2:49
 */
@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("/hello")
    public String test(){
        return "Hello World!";
    }
}
