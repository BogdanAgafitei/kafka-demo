package com.example.kafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public NewTopic hungrybytesTopic(){
        return TopicBuilder.name("hungrybytes")
                .build();
    }
}
