package com.example.Customer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Customer.Entity.Customer;
import com.example.Customer.Repository.CustomerRepository;
import com.example.Customer.VO.ResponseTemplateVO;
import com.example.Customer.VO.Washer;

@Service
public class CustomerService {

	
	@Autowired
	private CustomerRepository customerRepository;

	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	
	public Customer saveCustomer(Customer customer) {

		return customerRepository.save(customer);
	}

	public ResponseTemplateVO getCustomerWithWasher(Long customerId) {
	
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Customer customer = customerRepository.findByCustomerId(customerId);
		
//		return null;
		
		//ONE WAY ---NO USE OF EUREKA
//		Washer washer = 
//				restTemplate.getForObject(
//						"http://localhost:9902/washers/" + customer.getCustomerId(),
//						Washer.class);
		
		//AFTER USE OF EUREKA
		Washer washer = 
				restTemplate.getForObject(
						"http://WASHER-SERVICE/washers/" + customer.getCustomerId(),
						Washer.class);
		
		vo.setCustomer(customer);
		vo.setWasher(washer);
		
		return vo;
		
	}
	
}
