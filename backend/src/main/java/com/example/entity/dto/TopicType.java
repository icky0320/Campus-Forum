package com.example.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.entity.BaseData;
import lombok.Data;

/**
 * @Author: 程凯
 * @Package: com.example.entity.dto
 * @Project: jwt
 * @Name: TopicType
 * @Date: 2024/9/29  下午10:09
 */
@Data
@TableName("db_topic_type")
public class TopicType implements BaseData {
    Integer id;
    String name;
    @TableField("`desc`")
    String desc;
    String color;
}
