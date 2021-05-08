package com.saranraj3.coderulagam.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springbootservicediscovery2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootservicediscovery2Application.class, args);
	}

}
