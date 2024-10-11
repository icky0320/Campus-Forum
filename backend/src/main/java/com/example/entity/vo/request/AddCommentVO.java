package com.example.entity.vo.request;

import jakarta.validation.constraints.Min;
import lombok.Data;

/**
 * @Author: 程凯
 * @Package: com.example.entity.vo.request
 * @Project: jwt
 * @Name: AddCommentVO
 * @Date: 2024/10/11  下午1:40
 */
@Data
public class AddCommentVO {
    @Min(1)
    int tid;
    String content;
    @Min(-1)
    int quote;
}
