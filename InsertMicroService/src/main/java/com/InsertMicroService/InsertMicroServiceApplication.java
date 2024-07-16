package com.InsertMicroService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class InsertMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsertMicroServiceApplication.class, args);
	}

}
