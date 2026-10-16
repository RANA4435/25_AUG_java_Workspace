package com.StudentDetails;

class SuperUser{
	
}

public class User {
	String userName;
	String userId;
	String userMobile;
	
	User(String _userName, String _userId, String _userMobile){
		this(300);
		this.userName=_userName;
		this.userId=_userId;
		this.userMobile=_userMobile;
	}
	User(int age){
		System.out.println(age);
	}
	

}
