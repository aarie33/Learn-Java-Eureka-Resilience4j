package com.dans.eureka_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.dans.eureka_user")
public class DansEurekaUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(DansEurekaUserApplication.class, args);
	}

}
