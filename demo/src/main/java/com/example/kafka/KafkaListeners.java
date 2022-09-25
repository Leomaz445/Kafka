package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class KafkaListeners {

    @KafkaListener(topics = "leoCode",groupId = "foo")

    void lister(String data){
        System.out.println("Listner received"  + data + "^");
    }
}
