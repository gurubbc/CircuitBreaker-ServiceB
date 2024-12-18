package com.lowes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuruResilience4jCircuitbreakerServiceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuruResilience4jCircuitbreakerServiceBApplication.class, args);
		System.out.println("Service B started");
	}

}
