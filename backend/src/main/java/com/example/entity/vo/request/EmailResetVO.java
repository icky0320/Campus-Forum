package com.example.entity.vo.request;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * @Author: 程凯
 * @Package: com.example.entity.vo.request
 * @Project: jwt
 * @Name: EmailResetVO
 * @Date: 2024/9/17  下午2:25
 */
@Data
public class EmailResetVO {
    @Email
    String email;
    @Length(min = 6,max = 6)
    String code;
    @Length(min = 6,max = 20)
    String password;
}
