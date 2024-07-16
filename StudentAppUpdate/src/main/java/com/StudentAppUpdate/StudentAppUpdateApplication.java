package com.StudentAppUpdate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StudentAppUpdateApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppUpdateApplication.class, args);
	}

}
