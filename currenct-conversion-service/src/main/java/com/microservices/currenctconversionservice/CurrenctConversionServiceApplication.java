package com.microservices.currenctconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaServer
public class CurrenctConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrenctConversionServiceApplication.class, args);
	}

}
