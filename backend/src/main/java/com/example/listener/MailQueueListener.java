package com.example.listener;

import jakarta.annotation.Resource;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.xml.sax.ErrorHandler;

import java.util.Map;


/**
 * @Author: 程凯
 * @Package: com.example.listener
 * @Project: jwt
 * @Name: MailQueueListener
 * @Date: 2024/9/16  下午1:40
 */
@Component
@RabbitListener(queues = "mail")
public class MailQueueListener {

    @Resource
    JavaMailSender sender;

    @Value("${spring.mail.username}")
    String username;

    @RabbitHandler(isDefault = true)
    public void sendMailMessage(Map<String, Object> data) {
        System.out.println("Received message: " + data);
        String email = (String) data.get("email");
        Integer code = (Integer) data.get("code");
        String type = (String) data.get("type");
        SimpleMailMessage message = switch (type) {
            case "register" -> createMessage("欢迎注册我们的论坛",
                            "您的邮箱注册验证码为："+code+
                                    ",有效时间三分钟，为了保障您的信息安全，请勿向他人透露验证码。",email);
            case "reset" -> createMessage("您的密码重置邮件",
                    "您好，您正在进行重置密码操作，验证码"+code+
                            ",有效时间三分钟，如非本人操作，请无视邮件。",email);
            default ->  null;
        };
        if(message == null) return;
        sender.send(message);
    }

    private SimpleMailMessage createMessage(String title, String content, String email){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject(title);
        message.setText(content);
        message.setTo(email);
        message.setFrom(username);
        return message;
    }
}
