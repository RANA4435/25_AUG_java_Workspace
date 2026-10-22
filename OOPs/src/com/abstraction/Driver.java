package com.abstraction;
class Account {
	//required functionalities 
	public boolean openAccount(String name,String address,int age) {
		validatAddress(address);
		validateAge(age);
		validateName(name);
		System.out.println("openaccount...");
		return true;
	}
	//core functionalities
	private  void validatAddress(String address) {
		System.out.println("address validation is successful.."+address);
	}
	private  void validateAge(int age) {
		System.out.println("Age validation is successful.."+age);
	}
	private  void validateName(String name) {
		System.out.println("Name validation is successful.."+name);
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Abstraction means just showing the implementation or hiding the core functionalities
		
		Account acc = new Account();
		acc.openAccount("kamdev", "Bangalore", 20);

	}

}
