package com.kodewala.constructors;

public class Account {
	int amount;
	String name;
	
	
	Account(){
		System.out.println("inside amount()");
		
	}
    Account(int _amount, String _name){
    	System.out.println("inside amount()");
    	this.amount=_amount;
    	this.name=_name;
    	
    	
    }
}
