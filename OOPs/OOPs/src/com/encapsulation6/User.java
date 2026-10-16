package com.encapsulation6;

public class User {
	private String account;
	
	private User (String account){
		this.account=account;
	}
	public static void main(String[] args) {
		User user = new User("8638768736863");
		System.out.println(user.account);
	}
	

}

