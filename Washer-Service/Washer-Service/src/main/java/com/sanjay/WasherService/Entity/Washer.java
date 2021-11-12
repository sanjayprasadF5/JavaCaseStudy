package com.sanjay.WasherService.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Data;

@Data

@Entity
@Builder
public class Washer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long washerId;
	
	@NotBlank(message = "Please enter washerName")
	private String washerName;
	private String washerEmail;
	private String washerContact;

	public Washer() {
		super();
	}
	
	public Washer(Long washerId, String washerName, String washerEmail, String washerContact) {
		super();
		this.washerId = washerId;
		this.washerName = washerName;
		this.washerEmail = washerEmail;
		this.washerContact = washerContact;
	}
	
	public Long getWasherId() {
		return washerId;
	}
	public void setWasherId(Long washerId) {
		this.washerId = washerId;
	}
	
	public String getWasherName() {
		return washerName;
	}
	public void setWasherName(String washerName) {
		this.washerName = washerName;
	}
	
	public String getWasherEmail() {
		return washerEmail;
	}
	public void setWasherEmail(String washerEmail) {
		this.washerEmail = washerEmail;
	}
	
	public String getWasherContact() {
		return washerContact;
	}
	public void setWasherContact(String washerContact) {
		this.washerContact = washerContact;
	}
	@Override
	public String toString() {
		return "Washer [washerId=" + washerId + ", washerName=" + washerName + ", washerEmail=" + washerEmail
				+ ", washerContact=" + washerContact + "]";
	}
	
		
}
