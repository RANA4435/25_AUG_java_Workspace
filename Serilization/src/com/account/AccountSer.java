package com.account;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AccountSer {
	void doSerMsg(Bank bank) throws IOException {
		FileOutputStream fis = new FileOutputStream("message.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		
		oos.writeObject(bank);
		
		oos.close();
	}

}
