package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.dto.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: 程凯
 * @Package: com.example.mapper
 * @Project: jwt
 * @Name: AccountMapper
 * @Date: 2024/9/14  下午8:45
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}
