package com.enc.test;

public class Driver {
	
	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.setBalance(1000);
		acc.setName("KamDev");
		
		System.out.println("Balance: "+acc.getBalance());
		System.out.println("Name:"+acc.getName());
		
		acc.setBalance(500);
		acc.setName("Rana");
		
		System.out.println("Balance: "+acc.getBalance());
		System.out.println("Name:"+acc.getName());
	}

}
