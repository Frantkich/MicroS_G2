package com.microsg2.microsg2comment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Microsg2CommentApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(Microsg2CommentApplication.class, args);
	}

}
