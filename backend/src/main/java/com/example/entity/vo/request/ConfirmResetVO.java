package com.example.entity.vo.request;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * @Author: 程凯
 * @Package: com.example.entity.vo.request
 * @Project: jwt
 * @Name: ConfirmResetVO
 * @Date: 2024/9/17  下午2:22
 */
@Data
@AllArgsConstructor
public class ConfirmResetVO {
    @Email
    String email;
    @Length(max = 6,min = 6)
    String code;
}
