package com.encapsulation3;

public class driver {

	public static void main(String[] args) {

		BankAccount acc=new BankAccount(5000,"52215452656","Salman","SBI");
		
		//acc.doCredit(7);
		//acc.doWithdraw(500);
		
		//System.out.println("The balnce after the credit is :"+acc.getBalnce());
		System.out.println("the balance after withdraw:"+acc.getBalnce());

	}

}
