package com.makaia.back4.jpamysql.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.makaia.back4.jpamysql.services.Service;

@Component
public class Consumer {

    @Autowired
    Service mensajService;
        
}
