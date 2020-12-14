package com.microsg2.microsg2bootAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class Microsg2BootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microsg2BootAdminApplication.class, args);
	}

}
