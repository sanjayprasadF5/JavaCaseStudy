package com.example.Customer.VO;

import com.example.Customer.Entity.Customer;

public class ResponseTemplateVO {

	private Customer customer;
	private Washer washer;
	public ResponseTemplateVO() {
		super();
		
	}
	public ResponseTemplateVO(Customer customer, Washer washer) {
		super();
		this.customer = customer;
		this.washer = washer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Washer getWasher() {
		return washer;
	}
	public void setWasher(Washer washer) {
		this.washer = washer;
	}
	@Override
	public String toString() {
		return "ResponseTemplateVO [customer=" + customer + ", washer=" + washer + "]";
	}
	
	
}
