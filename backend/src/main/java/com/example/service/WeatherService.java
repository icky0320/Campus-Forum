package com.example.service;

import com.example.entity.vo.response.WeatherVO;

/**
 * @Author: 程凯
 * @Package: com.example.service
 * @Project: jwt
 * @Name: Weather
 * @Date: 2024/9/27  上午11:49
 */
public interface WeatherService {
    WeatherVO fetchWeather(double longitude,double latitude);
}
