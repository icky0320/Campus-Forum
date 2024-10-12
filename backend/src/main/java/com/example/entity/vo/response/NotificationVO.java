package com.example.entity.vo.response;

import lombok.Data;

import java.util.Date;

/**
 * @Author: 程凯
 * @Package: com.example.entity.vo.response
 * @Project: jwt
 * @Name: NotificationVO
 * @Date: 2024/10/12  下午2:09
 */
@Data
public class NotificationVO {
    Integer id;
    String title;
    String content;
    String type;
    String url;
    Date time;
}
