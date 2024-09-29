package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.dto.Topic;
import com.example.entity.dto.TopicType;
import com.example.entity.vo.request.TopicCreateVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 程凯
 * @Package: com.example.service
 * @Project: jwt
 * @Name: TopicService
 * @Date: 2024/9/29  下午10:08
 */
public interface TopicService extends IService<Topic> {
    List<TopicType> listTypes();
    String createTopic(int uid, TopicCreateVO vo);
}
