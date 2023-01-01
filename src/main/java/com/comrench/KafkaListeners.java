package com.comrench;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "comrench", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener Received: " + data + " :) ");
    }
}
