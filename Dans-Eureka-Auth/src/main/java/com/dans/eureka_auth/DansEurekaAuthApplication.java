package com.dans.eureka_auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.dans.eureka_auth.config.RandomLoadBalancerConfig;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.dans.eureka_auth")
@LoadBalancerClient(name = "dans-eureka-user", configuration = RandomLoadBalancerConfig.class)
public class DansEurekaAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(DansEurekaAuthApplication.class, args);
	}

}
