package com.creation.instance;

public class User {
	String name;
	String address;
	int amount;
	int age;
	
	static {
		System.out.println("i am in sib block");
	}
	public User(String name, String address, int amount, int age) {
		super();//either super or this can be the first keyword in the constructor
		System.out.println("I am a free guy");
		this.name = name;
		this.address = address;
		this.amount = amount;
		this.age = age;
	}
	
//	{
//		System.out.println("I am in IIB");
//	}

}
