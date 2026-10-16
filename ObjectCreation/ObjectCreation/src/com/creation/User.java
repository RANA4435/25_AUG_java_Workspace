package com.creation;

public class User {
	String userName;
	String userId;
	String mobilNumber;
	
	
	{
		System.out.println("I am in instance block: IIb");
		//it will execute for each object creation
	}
	
//	static 
//	{
//		System.out.println("I am in static init block");
//	}


	public User(String userNmae, String userId, String mobilNumber) {
		super();//either super or this
		System.out.println("user.user(String userName, String userId, String mobilNumber...constructor");
		this.userName = userNmae;
		this.userId = userId;
		this.mobilNumber = mobilNumber;
	}
	

}
