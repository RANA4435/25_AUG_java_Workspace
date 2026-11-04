package com.cloning.deepcloning1;

public class Address implements Cloneable {
	String city;
	String state;
	String country;
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	@Override 
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
