package com.revature.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics="myTopic", groupId= "mygroup")
	public void consumeFromTopic(String message) {
		System.out.println("Consumed message from producer and onto the cliuster of partitions. "+ message);
		
	}
}
