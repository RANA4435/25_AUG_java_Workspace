package com.interface8;

public class Driver {

	public static void main(String[] args) {
		IAccount account = (name,address,amt)->
		 
		{
			System.out.println("Opening an Account..."+name);
			return "Account Opened";
		};
		 String result=account.account("kamdev","Bangalore",1000);
		
//		IAccount acc = ()->
//		{
//			System.out.println("Opening Account is done...");
//		};
//		acc.addBeni();

	}

}
