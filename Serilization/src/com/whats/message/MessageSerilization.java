package com.whats.message;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSerilization {
	public void serializeMsg(Message message) throws IOException {
		FileOutputStream fis = new FileOutputStream("message.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		oos.writeObject(message);
		
		System.out.println("Serlization Done");
		
		oos.close();// close the objectout
		
	}

}
