package com.kodewala.control.flow2;

public class Ecommerce {
	public static void main(String args[]) {
		Ecommerce eco=new Ecommerce();
		String customer=args[1];
		int amount =Integer.parseInt(args[0]);
		
		eco.discountApply( amount,  customer);
		
	}
	//Creating a method
	
	public void discountApply(int amount,String customer) {
		double dis=0;
		double finalPrice=amount;
		switch(customer) {
		case "Gold":
			if(amount<1000) {
				System.out.println("Min Purchase is 1000");
			}
			 double discount=amount*20/100;
			 System.out.println("The Final amount="+discount);
			 break;
			 
		case "Silver":
			System.out.println("Silver");
			double discountAmount=amount*10/100;
			 System.out.println("The Final amount="+discountAmount);
			 break;
		case "Regular":
			double disAmount=amount*5/100;
			 System.out.println("The Final amount="+disAmount);
			 break;
		
		
		}
	}

}
