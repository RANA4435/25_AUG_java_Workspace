package com.cloning.shallow;

public class Employee  implements Cloneable{//Level-1 if u will talk about the nested
	String name;//copy 
	String userID;//copy
	Address address;//HAS-A //copy the reference not the object. this is shallow copy
	
	
	
	public Employee(String name, String userID, Address address) {
		super();
		this.name = name;
		this.userID = userID;
		this.address = address;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();	}
	
	
	
	
	

}
