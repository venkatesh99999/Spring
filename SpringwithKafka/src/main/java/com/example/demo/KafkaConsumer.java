package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "tarun",groupId = "console-consumer-76241")
	public void consume(String message) {
        System.out.println("Received message: " + message);
    }
	
}
