package com.example.service;

/*
  @Author: 程凯
 * @Package: com.example.service
 * @Project: jwt
 * @Name: AccountPrivacyService
 * @Date: 2024/9/23  下午5:25
 */
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.dto.AccountPrivacy;
import com.example.entity.vo.request.PrivacySaveVO;

public interface AccountPrivacyService extends IService<AccountPrivacy> {
    void savePrivacy(int id, PrivacySaveVO vo);
    AccountPrivacy accountPrivacy(int id);
}
