package com.encapsulation;

public class Driver {

	public static void main(String[] args) {
		Payment payment=new Payment(1000);// I am passing the amount 1000 
		
		payment.doCredit(100);// doing the credit in the available balance in the account
		// so the amount become 1100 now
		System.out.println("The available balance in the account:"+payment.getBalance());
		payment.doDebit(800);//now i am debit the amount from the available balance in the account 1100-800
		// so the balance become now 300. so it will print the amount /balance 300
		
		System.out.println("THE Available Balance in SBI is :"+payment.getBalance());


	}

}
