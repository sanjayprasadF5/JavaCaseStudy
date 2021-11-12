package com.example.Customer.VO;



public class Washer {

	private Long washerId;
	private String washerName;
	private String washerEmail;
	private String washerContact;
	public Washer() {
		super();
		// TODO Auto-generated constructor stub
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
