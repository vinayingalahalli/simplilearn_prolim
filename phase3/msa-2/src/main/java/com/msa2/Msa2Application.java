package com.msa2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Msa2Application {

	public static void main(String[] args) {
		SpringApplication.run(Msa2Application.class, args);
	}

}
