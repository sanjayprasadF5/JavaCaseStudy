package com.sanjay.WasherService.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjay.Washer.Errors.WasherNotFoundExceptions;
import com.sanjay.WasherService.Entity.Washer;
import com.sanjay.WasherService.Repository.WasherRepository;

@Service
public class WasherServiceImpl implements WasherService {

	@Autowired
	private WasherRepository washerRepository;
	
	@Override
	public Washer saveWasher(Washer washer) {
		return washerRepository.save(washer);
	}

	@Override
	public List<Washer> fetchWasher() {
		return washerRepository.findAll();
	}

	@Override
	public Washer fetchWasherById(Long washerId) throws WasherNotFoundExceptions {
//		return washerRepository.findById(washerId).get();
		 Optional<Washer> washer =
	                washerRepository.findById(washerId);

	        if(!washer.isPresent()) {
	            throw new WasherNotFoundExceptions("Washer Not Available");
	        }

	        return  washer.get();
	
	}

	@Override
	public void deleteWasherById(Long washerId) {
		washerRepository.deleteById(washerId);
		
	}

	@Override
	public Washer updateWasher(Long washerId, Washer washer) {
		Washer washerDb = washerRepository.findById(washerId).get();

	        if(Objects.nonNull(washer.getWasherName()) &&
	        !"".equalsIgnoreCase(washer.getWasherName())) {
	        	washerDb.setWasherName(washer.getWasherName());
	        }

	        if(Objects.nonNull(washer.getWasherEmail()) &&
	                !"".equalsIgnoreCase(washer.getWasherEmail())) {
	            washerDb.setWasherEmail(washer.getWasherEmail());
	        }

	        if(Objects.nonNull(washer.getWasherContact()) &&
	                !"".equalsIgnoreCase(washer.getWasherContact())) {
	            washer.setWasherContact(washer.getWasherContact());
	        }

	        return washerRepository.save(washerDb);
	
	}

	@Override
	public Washer fetchWasherByName(String washerName) {
		
		return washerRepository.findByWasherNameIgnoreCase(washerName);
	}
}