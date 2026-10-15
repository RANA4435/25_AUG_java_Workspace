package com.inheritence2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = new Product("Iphone","This is iphone",2,"In-Stock");
		
		//product.viewProductDetails();
		
        Elctronics kk = new Elctronics("Iphone","This is iphone",2,"In-Stock",true,1);
        System.out.println("Product Details");
		
		kk.viewElectronicsDetails();
		

		
		

	}

}
