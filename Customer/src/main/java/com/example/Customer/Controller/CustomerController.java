package com.example.Customer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Customer.Entity.Customer;
import com.example.Customer.Service.CustomerService;
import com.example.Customer.VO.ResponseTemplateVO;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/")
	public Customer saveCustomer(@RequestBody Customer customer)
	{
		return customerService.saveCustomer(customer);
		
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getCustomerWithWasher(@PathVariable("id") Long customerId)
	{
		return customerService.getCustomerWithWasher(customerId);
	}
	
}
