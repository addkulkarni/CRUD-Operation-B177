package com.StudentAppSave.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StudentAppSaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppSaveApplication.class, args);
	}

}
