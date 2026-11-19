package com.exception.handling1;

public class ShoppingCart {
	public static void main(String[] args) {
		System.out.println("Started main");
		ShoppingCart cart = new ShoppingCart();
		cart.doShop(null, null, 0);
		cart.doShop("Laptop", "abc", 5000);
		cart.doShop("laptop", "123", 100);
		System.out.println("Main End");
	}
	public void doShop(String productName,String quantity, int price) {
		System.out.println("doShop Start");
		boolean result=validateOrder(productName,quantity,price);
		if(result ) {
			System.out.println("Allowed to perform the task");
		}else {
			System.out.println("Not allowed to perform the task");
		}
		System.out.println("doShop End");
	} 
	private boolean validateOrder(String productName,String quantity, int price) {
		try {
			System.out.println("Find the length odf the productname="+productName.length());
			
			int quant = Integer.parseInt(quantity);
			System.out.println("print the quant ="+quant);
			
			int result =price/0;
			System.out.println("Print the result="+result);
			
			String str = String.valueOf(price);
			System.out.println("Print the price of the ="+str);
			return true;
		}
		catch(NullPointerException e) {
			System.out.println("The name of the productName is not be null");
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			System.out.println("The number should be in integer format");
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("The price cannot be divided by 0=");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("The type of the Exception occurred while Executing the program is ");
			e.printStackTrace();
		}
		finally {
			System.out.println("Please input the valid details ");
		}
		return false;
	}

}
