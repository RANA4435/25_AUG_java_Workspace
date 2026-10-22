package com.polymorphism;

class User 
{
	
}
class AdminUser extends User
{
	
}
class FinanceUser extends User
{
	
}
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();//User class is reffering the class object
		
		
		AdminUser admin = new AdminUser();
		
		
		User user1 = new AdminUser();//User class is reffering the child class object-->Auto-->upcasting
		
		AdminUser user2 = (AdminUser)new User();//AdminUser class is reffering the parents class object-->Auto-downcasting

	}

}
