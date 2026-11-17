package com.cloning.deepcloning4;

public class Delivery implements Cloneable
{
	String name;
	Address address;
	public Delivery(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		Delivery delivery = (Delivery) super.clone();
		delivery.address = (Address) address.clone();
		return delivery;
	}

}
