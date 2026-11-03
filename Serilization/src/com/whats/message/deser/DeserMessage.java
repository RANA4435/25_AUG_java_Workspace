package com.whats.message.deser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.whats.message.Message;

public class DeserMessage {
	
	void deserialiazeMsg() throws ClassNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("message.txt");
		
		ObjectInputStream oos = new ObjectInputStream(fis);
		
	
		Message message = (Message)  oos.readObject();
		
		System.out.println(message.getName() +" "+message.getAddress()+" "+""+message.getAccNo());
		
		
		
		oos.close();
	}

}
