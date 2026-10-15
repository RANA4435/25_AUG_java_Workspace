package com.encapsulation4;

public class Driver {

	public static void main(String[] args) {
//		private String name;
//		private String accountHolder;
//		private String sender;
//		
//		private int balance;
		// TODO Auto-generated method stub
		Account account = new Account("Rana ","555454548932654","satish",6000);
		
		account.doInterest(5000);
		
		
		System.out.println("The balance after the Interest is :"+account.getBalance());

	}

}
