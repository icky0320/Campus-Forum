package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.dto.Account;
import com.example.entity.vo.request.*;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @Author: 程凯
 * @Package: com.example.service
 * @Project: jwt
 * @Name: AccountService
 * @Date: 2024/9/14  下午8:46
 */

public interface AccountService extends IService<Account>, UserDetailsService {
    Account findAccountByNameOrEmail(String text);
    Account findAccountById(int id);
    String registerEmailVerifyCode(String type, String email, String address);
    String registerEmailAccount(EmailRegisterVO info);
    String resetEmailAccountPassword(EmailResetVO info);
    String resetConfirm(ConfirmResetVO info);
    String modifyEmail(int id, ModifyEmailVO vo);
    String changePassword(int id, ChangePasswordVO vo);
}
