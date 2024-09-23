package com.example.entity.vo.response;

/**
 * @Author: 程凯
 * @Package: com.example.entity.vo.response
 * @Project: jwt
 * @Name: AccountVO
 * @Date: 2024/9/23  下午5:20
 */
import lombok.Data;

import java.util.Date;

@Data
public class AccountVO {
    String username;
    String email;
    String role;
    String avatar;
    Date registerTime;
}
