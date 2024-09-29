package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.dto.TopicType;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: 程凯
 * @Package: com.example.mapper
 * @Project: jwt
 * @Name: TopicTypeMapper
 * @Date: 2024/9/29  下午10:11
 */
@Mapper
public interface TopicTypeMapper extends BaseMapper<TopicType> {
}
