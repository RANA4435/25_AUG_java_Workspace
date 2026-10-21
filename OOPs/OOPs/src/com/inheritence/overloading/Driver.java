package com.inheritence.overloading;
class Account {
	int age;
	//OverLoading create a ,method with the same name 
	//it can be public, private,default,and protected 
	//it gives client more option 
	//type , number of args and the order args
	// method parameters can be different
	// But if u create the method as  private it will be consider as overloading but it will be not able to call with creating an object  
	
	// it is providing multiple version of method 
	//it happens within the class
	public void doLogin(String name,String email,long number) {//v1
		System.out.println("DoLogin..");
	}
	private void doLogin(String name,String email) {//v2
		System.out.println("DoLogin..");

	}
	public String doLogin(String email) {//v3
		System.out.println("doLogin...");
		return "";
	}
	
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		acc.doLogin("kamdevrana61@gmail.com");
		
		acc.doLogin("kamdev", "kamdevrana61@gmail.com", 6202194435L);

	}

}
