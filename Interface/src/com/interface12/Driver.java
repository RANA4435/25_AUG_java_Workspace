package com.interface12;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {

		Account acc = new Account("Satish", "Koderma", "36129887217");
		Account clonedObj = (Account) acc.clone();
		System.out.println(clonedObj.name);

		if(acc instanceof Cloneable) {
			System.out.println("Allow to print the value..");
		}else {
			System.out.println("false");
		}
	}
}