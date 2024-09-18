package com.example.entity.vo.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * @Author: 程凯
 * @Package: com.example.entity.vo.request
 * @Project: jwt
 * @Name: EmailRegister
 * @Date: 2024/9/16  下午9:16
 */
@Data
public class EmailRegisterVO {
    @Email
    @Length(min = 4)
    String email;
    @Length(max = 6, min = 6)
    String code;
    @Pattern(regexp = "^[a-zA-Z0-9\\u4e00-\\u9fa5]+$")
    @Length(min = 1, max = 10)
    String username;
    @Length(max = 20, min = 6)
    String password;
}
