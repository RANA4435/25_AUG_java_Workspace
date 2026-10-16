package com.creation.user;

import com.creation.user1.User;

public class Driver {

	public static void main(String[] args) {
		//System.out.println("Sart");
		
		for(int i=0; i<10000;i++)
		{
			User user=new User("kamdev","ghvh334");
		}
		
		System.out.println("Live user :"+User.liverUSerCount);
	
		//System.out.println("END");

	}

}
