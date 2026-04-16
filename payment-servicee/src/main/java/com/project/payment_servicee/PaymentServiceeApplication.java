package com.project.payment_servicee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentServiceeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceeApplication.class, args);
	}

}
