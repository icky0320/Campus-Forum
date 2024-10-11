package com.example.entity.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @Author: 程凯
 * @Package: com.example.entity.dto
 * @Project: jwt
 * @Name: TopicComment
 * @Date: 2024/10/11  下午1:53
 */
@Data
@TableName("db_topic_comment")
public class TopicComment {
    @TableId(type = IdType.AUTO)
    Integer id;
    Integer uid;
    Integer tid;
    String content;
    Date time;
    Integer quote;
}
