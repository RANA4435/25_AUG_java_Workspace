package com.cloning.deepcloning4;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("Barhi", "Hazaribagh");
		
		Delivery delivery = new Delivery("Kamdev", address);
		
		Delivery clonedObj = (Delivery) delivery.clone();
		
		delivery.address.line="Ranchi";
		
		System.out.println("The Original object after the change  is ="+delivery.address.line);
		System.out.println("The cloned object is ="+clonedObj.address.line);
	}

}
