package com.chris.servicefinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceFinderApplication.class, args);
	}

}
