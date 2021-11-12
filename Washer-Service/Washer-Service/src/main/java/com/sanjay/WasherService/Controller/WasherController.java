package com.sanjay.WasherService.Controller;

import java.util.List;
//
//import org.hibernate.annotations.common.util.impl.LoggerFactory;
//import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.Washer.Errors.WasherNotFoundExceptions;
import com.sanjay.WasherService.Entity.Washer;
import com.sanjay.WasherService.Service.WasherService;



@RestController
@RequestMapping("")
public class WasherController {

	@Autowired
	private WasherService washerService;
//	
//	private final Logger LOGGER =  LoggerFactory.logger(name: WasherController.class);
//	
	
	@PostMapping("/washers")
	public Washer saveWasher(@RequestBody Washer washer) {
		return washerService.saveWasher(washer);
		
	}
	
	@GetMapping("/washers")
	public List<Washer> fetchWasher(){
		return washerService.fetchWasher();
	}
	
	@GetMapping("/washers/{id}")
	public Washer fetchWasherById(@PathVariable("id") Long washerId) throws WasherNotFoundExceptions {
		return washerService.fetchWasherById(washerId);
	}

	@DeleteMapping("/washers/{id}")
	public String deleteWasherById(@PathVariable("id") Long washerId) {
		washerService.deleteWasherById(washerId);
		return "Washer Deleted Successfully";
		
	}
	
	
	@PutMapping("/washers/{id}")
	public Washer updateWasher(@PathVariable("id") Long washerId,
									@RequestBody Washer washer){
		return washerService.updateWasher(washerId,washer);
		
	}
	
	@GetMapping("/washers/name/{name}")
	public Washer fetchWasherByName(@PathVariable("name") String washerName) {
		return washerService.fetchWasherByName(washerName);
		
	}
	
}
