package com.creation.user1;

public class User {
	String name;
	String userId;
	String type;
	
	public static int liverUSerCount=0;

	public User(String name, String userId, String type) {
		super();
		this.name = name;
		this.userId = userId;
		this.type = type;
	}

	public User( String userId, String type) {
		super();
		this.userId = userId;
		this.type = type;
	}
	{
		liverUSerCount=liverUSerCount+1;
	}
	

}
