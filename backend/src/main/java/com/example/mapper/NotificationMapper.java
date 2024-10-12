package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.dto.Notification;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: 程凯
 * @Package: com.example.mapper
 * @Project: jwt
 * @Name: NotificationMapper
 * @Date: 2024/10/12  下午2:06
 */
@Mapper
public interface NotificationMapper extends BaseMapper<Notification> {
}
