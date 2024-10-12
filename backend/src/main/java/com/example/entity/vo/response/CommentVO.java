package com.example.entity.vo.response;

import lombok.Data;

import java.util.Date;

/**
 * @Author: 程凯
 * @Package: com.example.entity.vo.response
 * @Project: jwt
 * @Name: CommentVO
 * @Date: 2024/10/12  上午10:51
 */
@Data
public class CommentVO {
    int id;
    String content;
    Date time;
    String quote;
    User user;

    @Data
    public static class User{
        Integer id;
        String username;
        String avatar;
        Integer gender;
        String qq;
        String wx;
        String phone;
        String email;
    }
}
