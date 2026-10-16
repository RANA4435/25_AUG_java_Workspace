package com.inheritence3;

public class Electronics extends ProductName {
	
	boolean isWarranty;
	int warranty;
	public Electronics(String productName, String address, int price, String buyerName, String description,
			boolean isWarranty, int warranty) {
		super(productName, address, price, buyerName, description);
		this.isWarranty = isWarranty;
		this.warranty = warranty;
	}
	
	
	public void viewElectronicsDetails() {
		System.out.println("Product name:"+productName);
		System.out.println(" Address:"+address);
		System.out.println(" Price:"+price);
		System.out.println(" Buyer:"+buyerName);
		System.out.println(" Description:"+description);
		
		
		System.out.println("Is the product is in warranty:"+isWarranty);
		System.out.println("How many years of warranty it  have"+warranty);
	}
	

}
