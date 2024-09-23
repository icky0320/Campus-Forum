package com.example.entity.vo.request;

/**
 * @Author: 程凯
 * @Package: com.example.entity.vo.request
 * @Project: jwt
 * @Name: ChangePasswordVO
 * @Date: 2024/9/23  下午5:16
 */
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class ChangePasswordVO {
    @Length(min = 6, max = 20)
    String password;
    @Length(min = 6, max = 20)
    String new_password;
}
