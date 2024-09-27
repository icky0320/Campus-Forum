package com.example.entity.vo.response;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import lombok.Data;

/**
 * @Author: 程凯
 * @Package: com.example.entity.vo.response
 * @Project: jwt
 * @Name: WeatherVO
 * @Date: 2024/9/27  上午11:47
 */
@Data
public class WeatherVO {
    JSONObject location;
    JSONObject now;
    JSONArray hourly;
}
