package com.microsg2.microsg2author;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;

import com.microsg2.microsg2author.models.Author;
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
	
	@PostConstruct
	public void encryptPassword() {
		Iterable<Author> authors = authorRepository.findAll();
		for(Author a: authors){
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String newpassword = passwordEncoder.encode(a.getPassword());
			a.setPassword(newpassword);
			authorRepository.save(a);	
		}
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Microsg2AuthorApplication.class, args);
	}

}
