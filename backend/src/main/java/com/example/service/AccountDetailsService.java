package com.example.service;

/*
  @Author: 程凯
 * @Package: com.example.service
 * @Project: jwt
 * @Name: AccountDetailsService
 * @Date: 2024/9/23  下午5:25
 */
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.dto.AccountDetails;
import com.example.entity.vo.request.DetailsSaveVO;

public interface AccountDetailsService extends IService<AccountDetails> {
    AccountDetails findAccountDetailsById(int id);
    boolean saveAccountDetails(int id, DetailsSaveVO vo);
}
