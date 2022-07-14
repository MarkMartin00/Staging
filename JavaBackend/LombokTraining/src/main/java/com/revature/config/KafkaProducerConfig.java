package com.revature.config;

import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;


@Configuration
public class KafkaProducerConfig {

	@Value(value = "${kafka.bootstrapAddressString}")
	private String bootStrapAddressString;
	
	@Bean
	public ProducerFactory<String, String> producerFactory() {
		Map<String, Object> configPropsMap = new HashMap<>();
		configPropsMap.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootStrapAddressString);
		configPropsMap.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configPropsMap.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		return new DefaultKafkaProducerFactory<>(configPropsMap);
	}
	
	@Bean
	public KafkaTemplate<String, String> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory());
	}
	
	
}
