package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.dto.TopicComment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: 程凯
 * @Package: com.example.mapper
 * @Project: jwt
 * @Name: TopicComment
 * @Date: 2024/10/11  下午1:55
 */
@Mapper
public interface TopicCommentMapper extends BaseMapper<TopicComment> {
}
