package com.example.config;

import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @Author: 程凯
 * @Package: com.example.config
 * @Project: jwt
 * @Name: RabbitConfiguration
 * @Date: 2024/9/16  下午1:21
 */
@Configuration
public class RabbitConfiguration {

    @Bean("emailQueue")
    public Queue emailQueue(){
        return QueueBuilder
                .durable("mail")
                .build();
    }

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

}
