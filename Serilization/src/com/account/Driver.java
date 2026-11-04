package com.account;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		AccountSer acc = new AccountSer();
		Bank bank =new Bank("Suraj","Ranchi","45644344");
		
		acc.doSerMsg(bank);
		System.out.println("Serialization is done");

	}

}
