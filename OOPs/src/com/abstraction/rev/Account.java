package com.abstraction.rev;

public class Account {
	public void openAccount(String name, int age,String address) {
		doValidateName(name);
		doValidateAge(age);
		doValidateAddress(address);
		System.out.println("Accont.openAccount...");
	}
	private void doValidateName(String name) {
		System.out.println("doValidation of name..: "+name);
	}
	private void doValidateAge(int age) {
		System.out.println("doValidation of Age: "+age);
	}
	private void doValidateAddress(String address) {
		System.out.println("doValidation of Address: "+address);
	}



}
