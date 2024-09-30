package com.example.utils;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author: 程凯
 * @Package: com.example.utils
 * @Project: jwt
 * @Name: CacheUtils
 * @Date: 2024/9/30  下午4:36
 */
@Component
public class CacheUtils {
    @Resource
    StringRedisTemplate template;

    public <T> T takeFromCache(String key, Class<T> dataType){
        String s = template.opsForValue().get(key);
        if (s == null) return null;
        return JSONObject.parseObject(s).to(dataType);
    }

    public <T> List<T> takeListFromCache(String key, Class<T> itemType){
        String s = template.opsForValue().get(key);
        if (s == null) return null;
        return JSONArray.parseArray(s).toList(itemType);
    }

    public <T> void saveToCache(String key, T data, long expire){
        template.opsForValue().set(key, JSONObject.from(data).toJSONString(), expire, TimeUnit.SECONDS);
    }

    public <T> void saveListToCache(String key, List<T> list, long expire){
        template.opsForValue().set(key, JSONArray.from(list).toJSONString(), expire, TimeUnit.SECONDS);
    }

    public void deleteCache(String key){
        template.delete(key);
    }
}
