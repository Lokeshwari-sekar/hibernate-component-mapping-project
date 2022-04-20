package com.edu;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address
{
	@Column(name="emp_pincode")
	private int pincode;
	@Column(name="emp_state",length=20)
	private String state;
	@Column(name="emp_country",length=20)
	private String country;
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Address(int pincode, String state, String country) {
		super();
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}
	
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", state=" + state + ", country=" + country + "]";
	}
	
	

}
