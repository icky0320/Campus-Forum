package com.example.entity.vo.response;

/**
 * @Author: 程凯
 * @Package: com.example.entity.vo.response
 * @Project: jwt
 * @Name: AccountPrivacyVO
 * @Date: 2024/9/23  下午5:20
 */
import lombok.Data;

@Data
public class AccountPrivacyVO {
    boolean phone;
    boolean email;
    boolean wx;
    boolean qq;
    boolean gender;
}
