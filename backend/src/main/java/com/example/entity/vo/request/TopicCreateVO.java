package com.example.entity.vo.request;

import com.alibaba.fastjson2.JSONObject;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * @Author: 程凯
 * @Package: com.example.entity.vo.request
 * @Project: jwt
 * @Name: TopicCreateVO
 * @Date: 2024/9/29  下午11:24
 */
@Data
public class TopicCreateVO {
    @Min(1)
    int type;
    @Length(min = 1, max = 30)
    String title;
    JSONObject content;
}
