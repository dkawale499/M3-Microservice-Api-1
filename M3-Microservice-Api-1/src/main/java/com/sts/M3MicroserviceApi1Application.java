package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class M3MicroserviceApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(M3MicroserviceApi1Application.class, args);
		
		
	}

}
