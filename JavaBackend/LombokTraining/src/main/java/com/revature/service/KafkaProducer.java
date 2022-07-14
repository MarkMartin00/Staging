package com.revature.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

		public static final String topic = "myTopic";
		
		private KafkaTemplate<String,String> kafkaTemp;
		
		//This method creates a Producer message
		public void publishToTopic(String message) {
			System.out.println("Publishing to topic " + topic);
			this.kafkaTemp.send(topic, message);
		}
}
