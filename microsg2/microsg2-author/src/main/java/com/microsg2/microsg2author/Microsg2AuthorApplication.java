package com.microsg2.microsg2author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.microsg2.microsg2author.repositories.AuthorRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class Microsg2AuthorApplication {
	
	@Bean
	@LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
	@Autowired
	AuthorRepository authorRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Microsg2AuthorApplication.class, args);
	}

}
