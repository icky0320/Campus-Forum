package com.example.entity.vo.response;

import lombok.Data;

import java.util.Date;

/**
 * @Author: 程凯
 * @Package: com.example.entity.vo.response
 * @Project: jwt
 * @Name: AuthorizeVO
 * @Date: 2024/9/14  下午2:18
 */
@Data
public class AuthorizeVO {
    String username;
    String role;
    String token;
    Date expire;
}
