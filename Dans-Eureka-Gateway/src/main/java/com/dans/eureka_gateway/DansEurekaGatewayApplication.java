package com.dans.eureka_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;

import com.dans.eureka_gateway.config.RandomLoadBalancerConfig;

@SpringBootApplication
@EnableDiscoveryClient
@LoadBalancerClients({
    @LoadBalancerClient(name = "dans-eureka-user", configuration = RandomLoadBalancerConfig.class),
    @LoadBalancerClient(name = "dans-eureka-auth", configuration = RandomLoadBalancerConfig.class)
})
public class DansEurekaGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DansEurekaGatewayApplication.class, args);
	}

}
