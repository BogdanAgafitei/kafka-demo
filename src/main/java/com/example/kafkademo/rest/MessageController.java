package com.example.kafkademo.rest;

import com.example.kafkademo.config.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @PostMapping("/message")
    public void publish(@RequestBody MessageRequest request){
        kafkaTemplate.send("hungrybytes",request.message());
    }


}
