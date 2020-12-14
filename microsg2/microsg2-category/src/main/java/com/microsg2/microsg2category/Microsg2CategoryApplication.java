package com.microsg2.microsg2category;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Microsg2CategoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microsg2CategoryApplication.class, args);
	}

}
