package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringApplication.class, args);
	}
	
	@Bean
	public Class newSample() {
		Class newSample = null;
//		newSample.setterItem(item1());
		return newSample;
	}

	private Object item1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
