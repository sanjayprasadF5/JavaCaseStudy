package com.sanjay.WasherService.Service;

import java.util.List;

import com.sanjay.Washer.Errors.WasherNotFoundExceptions;
import com.sanjay.WasherService.Entity.Washer;

public interface WasherService {

	public Washer saveWasher(Washer washer);

	public List<Washer> fetchWasher();

	public Washer fetchWasherById(Long washerId) throws WasherNotFoundExceptions;

	public void deleteWasherById(Long washerId);

	public Washer updateWasher(Long washerId, Washer washer);

	public Washer fetchWasherByName(String washerName);

	

}
