package com.exception.handling2;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Main Start");
		AccountMgmt acc= new AccountMgmt();
		acc.openAccount("Kamdev", "BTM Bangalore");
		System.out.println("Main End");
	}

}
