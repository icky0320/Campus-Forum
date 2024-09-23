package com.example.mapper;

/**
 * @Author: 程凯
 * @Package: com.example.mapper
 * @Project: jwt
 * @Name: AccountPrivacyMapper
 * @Date: 2024/9/23  下午5:23
 */
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.dto.AccountPrivacy;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountPrivacyMapper extends BaseMapper<AccountPrivacy> {
}
