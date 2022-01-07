package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesEurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesEurekaProviderApplication.class, args);
		System.out.println("Provider Application Started!!!");
	}

}
