package com.example.mapper;

/**
 * @Author: 程凯
 * @Package: com.example.mapper
 * @Project: jwt
 * @Name: AccountDetailsMapper
 * @Date: 2024/9/23  下午5:24
 */
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.dto.AccountDetails;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountDetailsMapper extends BaseMapper<AccountDetails> {
}
