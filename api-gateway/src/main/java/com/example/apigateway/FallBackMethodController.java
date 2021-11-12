package com.example.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class FallBackMethodController {

	@GetMapping("/customerServiceFallBack")
	public String customerServiceFallBackMethod() {
		return "Customer Service are down try again";	
	}

//	@GetMapping("/customer")
//	@CircuitBreaker(fallbackMethod = "customerServiceFallBackMethod", name = CUSTOMER-SERVICE)
//	public String customerServiceFallBackMethod() {
//		return "Customer Service are down try again";	
//	}

	
	@GetMapping("/washerServiceFallBack")
	public String washerServiceFallBackMethod() {
		return " Washer Service are down try again";	
	}
}
