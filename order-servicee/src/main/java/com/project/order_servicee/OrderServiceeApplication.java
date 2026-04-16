package com.project.order_servicee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.project.order_servicee.service")
public class OrderServiceeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceeApplication.class, args);
	}

}
