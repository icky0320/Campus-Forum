package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.dto.Topic;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: 程凯
 * @Package: com.example.mapper
 * @Project: jwt
 * @Name: TopicMapper
 * @Date: 2024/9/29  下午11:21
 */
@Mapper
public interface TopicMapper extends BaseMapper<Topic> {
}
