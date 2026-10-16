package com.StudentDetails;

public class Bank {
	String name;
	int amount;
	String accountNumber;
	
	Bank(String _name,String _accountNumber,int _amount){
		this.name=_name;
		this.accountNumber=_accountNumber;
		this.amount=_amount;
		
	}
	Bank(String _name, String _accountNumber){
		this.name=_name;
		this.accountNumber=_accountNumber;
		
	}
	Bank(String _accountNumber, int _amount){
		this.accountNumber=_accountNumber;
		this.amount=_amount;
		
	}
	Bank(int _amount){
		this.amount=_amount;
		
	}

	 Bank(int _amount,String _name){
		 this.amount=_amount;
		 this.name=_name;
		 
		 
	 }
	 Bank(){
		 
	 }

}
