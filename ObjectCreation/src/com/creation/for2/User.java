package com.creation.for2;

public class User {
	String name;
	String userId;
	String acc;
	String type;
	
	int age;
	
	public static  int liverUserCount=0;

	public User(String name, String userId, String acc, String type, int age) {
		super();
		this.name = name;
		this.userId = userId;
		this.acc = acc;
		this.type = type;
		this.age = age;
	}

	public User( String userId, String acc, String type, int age) {
		super();
		this.name = name;
		this.userId = userId;
		this.acc = acc;
		this.type = type;
		this.age = age;
	}
	public User(){
		
	}
	{
		liverUserCount=liverUserCount+1;
	}
	
	
	
}
