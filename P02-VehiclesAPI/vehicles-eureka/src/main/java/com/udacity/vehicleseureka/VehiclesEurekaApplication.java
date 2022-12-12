package com.udacity.vehicleseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VehiclesEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiclesEurekaApplication.class, args);
	}

}
