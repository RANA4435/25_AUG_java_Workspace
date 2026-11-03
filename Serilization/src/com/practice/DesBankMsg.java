package com.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesBankMsg {
	
	public void deMsgBank() throws IOException, ClassNotFoundException {
	FileInputStream fis = new FileInputStream("C:\\Users\\kamde\\OneDrive\\Desktop\\newKamdev\\25_AUG_java_Workspace\\Serilization\\src\\com\\practice\\bank.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	
	 Bank bank = (Bank)ois.readObject();
	 
	 System.out.println(bank.getName()+" "+bank.getBalance()+" "+bank.getAadharNumber()+" "+bank.getPanNumber());
	 
	 ois.close();
	}

}
