package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.dto.Notification;
import com.example.entity.vo.response.NotificationVO;

import java.util.List;

/**
 * @Author: 程凯
 * @Package: com.example.service
 * @Project: jwt
 * @Name: NotificationService
 * @Date: 2024/10/12  下午2:07
 */
public interface NotificationService extends IService<Notification> {
    List<NotificationVO> findUserNotification(int uid);
    void deleteUserNotification(int id, int uid);
    void deleteUserAllNotification(int uid);
    void addNotification(int uid, String title, String content, String type, String url);
}
