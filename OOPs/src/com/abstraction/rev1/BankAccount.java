package com.abstraction.rev1;

public class BankAccount {
	//Abstraction 
	public boolean openAccount(String name, int age, String address) {
		doValidateName(name);
		doValidateAge(age);
		doValidateAddress(address);
		System.out.println("Opening an Account in SBI:");
		return true;
	}
	private void doValidateName(String name) {
		System.out.println("the validation of name is successful:"+name);
	}
	private void doValidateAge(int age) {
		System.out.println("the validation of age is successful:"+age);
	}
	private void doValidateAddress(String address) {
		System.out.println("the validation of place is successful:"+address);
	}


}
