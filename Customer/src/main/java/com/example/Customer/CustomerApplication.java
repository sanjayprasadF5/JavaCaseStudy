package com.example.Customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Bean
	//Since we connected with customer service we have to load balance
	//if there is multiple service are registry with eureka so it can laod balances
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
