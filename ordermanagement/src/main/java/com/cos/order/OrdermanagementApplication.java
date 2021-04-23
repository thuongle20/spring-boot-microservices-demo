package com.cos.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class OrdermanagementApplication {
	//private static final Logger log = LoggerFactory.getLogger(OrdermanagementApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(OrdermanagementApplication.class, args);
	}
	
	
	

}
