package com.makaia.back4.jpamysql.publisher;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PublisherConfig {

    @Value("${redSocial.rabbit.queue.mensajeEnviado}")
    private String name;

    @Bean
    public Queue queue() {
        return new Queue(this.name);
    }

}
