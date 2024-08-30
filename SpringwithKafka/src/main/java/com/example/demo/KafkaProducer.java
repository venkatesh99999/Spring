package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	private static final String Topic="tarun";
	
	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;
	
	public void sendMessage(String message) {
        kafkaTemplate.send(Topic, message);
        System.out.println("Message sent");
    }

}
