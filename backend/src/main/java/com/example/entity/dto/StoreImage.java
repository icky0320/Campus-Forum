package com.example.entity.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.checkerframework.checker.units.qual.A;

import java.util.Date;

/**
 * @Author: 程凯
 * @Package: com.example.entity.dto
 * @Project: jwt
 * @Name: StoreImage
 * @Date: 2024/9/27  下午11:23
 */
@Data
@TableName("db_image_store")
@AllArgsConstructor
public class StoreImage {
    Integer uid;
    String name;
    Date date;
}
