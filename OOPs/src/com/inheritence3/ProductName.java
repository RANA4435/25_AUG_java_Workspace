package com.inheritence3;

public class ProductName {
	String productName;
	String address;
	int price;
	String buyerName;
	String description;
	public ProductName(String productName, String address, int price, String buyerName, String description) {
		super();
		this.productName = productName;
		this.address = address;
		this.price = price;
		this.buyerName = buyerName;
		this.description = description;
	}
	
	public void viewDetails() {
		System.out.println("Product name:"+productName);
		System.out.println(" Address:"+address);
		System.out.println(" Price:"+price);
		System.out.println(" Buyer:"+buyerName);
		System.out.println(" Description:"+description);
	}

}

