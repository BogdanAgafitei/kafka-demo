package com.example.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "hungrybytes", groupId = "groupID")
    void listener(String data){
        System.out.println("Received: "+ data);
    }
}
