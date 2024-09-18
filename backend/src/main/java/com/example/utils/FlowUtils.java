package com.example.utils;

import jakarta.annotation.Resource;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Author: 程凯
 * @Package: com.example.utils
 * @Project: jwt
 * @Name: FlowUtils
 * @Date: 2024/9/16  下午1:29
 */
@Component
public class FlowUtils {

    @Resource
    StringRedisTemplate template;

    public boolean limitOnceCheck(String key, int blockTime){
        if (Boolean.TRUE.equals(template.hasKey(key))){
            return false;
        } else {
            template.opsForValue().set(key, "", blockTime, TimeUnit.SECONDS);
            return true;
        }
    }
}
