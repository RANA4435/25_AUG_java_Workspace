package com.abstraction1;

public class PlaceOrder {
	//required functionalities
	public boolean placeOrder(String name, String address,int size,int price) {
		validateName( name);
		validateAddress(address);
		doSize(size);
		validatePrice(price);
		return true;
	}
	//core functionalities
	private boolean validateName(String name) {
		System.out.println("Name:"+name);

		if(name.length() <2) {
		return false;
		}
		return true;
	}
	private boolean validateAddress(String address) {
		System.out.println("Address of the Delivery is :"+address);

		if(address ==null || address.trim().isEmpty()) {
			return false;
		}
		return true;
	}
	private int doSize(int size) {
		System.out.println("Size:"+size);
		return 38;
	}
	private int validatePrice(int price) {
		
		System.out.println("Price:"+price);
		return 200;
	}
	

}
