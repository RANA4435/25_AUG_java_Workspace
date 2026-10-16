package com.creation.for1;

import com.creation.for2.User;

public class Driver {
	public static void main(String[] args) {
//		String name;
//		String userId;
//		String acc;
//		String type;
		User user=new  User("kamdev","ghfd674","534654534","paid",20);
		User user1=new  User("Salman","ghfd674jd","534654534","paid",54);
		User kk5=new User("geyg647","4544555454","paid",8);
		User user2=new  User("Huzzur","ghfd674dd","534654534","paid",50);
		
		User kk=new User("geyg647","4544555454","paid",8);
		User kk1=new User("Satish","geyg647","4544555454","paid",67);
		User kk2=new User("Satish","geyg647","4544555454","paid",90);
		User kk3=new User("Satish","geyg647","4544555454","paid",98);
		
		System.out.println("Live User :"+User.liverUserCount);
	}
	
	
}
