package com.sanjay.WasherService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanjay.WasherService.Entity.Washer;

@Repository
public interface WasherRepository extends JpaRepository<Washer, Long>{


	public Washer findByWasherName(String washerName);
	public Washer findByWasherNameIgnoreCase(String washerName);

}
