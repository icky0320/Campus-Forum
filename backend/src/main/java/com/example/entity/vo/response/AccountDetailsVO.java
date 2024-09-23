package com.example.entity.vo.response;

/**
 * @Author: 程凯
 * @Package: com.example.entity.vo.response
 * @Project: jwt
 * @Name: AccountDetailsVO
 * @Date: 2024/9/23  下午5:20
 */
import lombok.Data;

@Data
public class AccountDetailsVO {
    int gender;
    String phone;
    String qq;
    String wx;
    String desc;
}
