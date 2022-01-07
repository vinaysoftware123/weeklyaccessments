package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesEurekaServerApplication.class, args);
		System.out.println("Eureka server started!!!");
	}

}
