package com.string;

class User {
	String name;

	public User(String name) {
		super();
		this.name = name;
	}
	
}

public class Driver3 {

	public static void main(String[] args) {
		String city1="Bangalore";
		String city2="Bangalore";
		//metaSpace is where the class is loaded and bytecode id stored;
		//do study about prem gen and the metaSpace;
		
		
		System.out.println(city1==city2);// == checks the address of the object "abc234-->"abc123"
		System.out.println(city1.equals(city2));//equals check the value of the object "Bangalor"--->"Bangalore";
		
		
		String city=new String("Kodewala");
		String city4=new String("Bangalore");
		
		System.out.println(city==city4);
		System.out.println(city.equals(city4));
		
		User user=new User("Kamdev");
		User user1=new User("Sandeep");
		
		System.out.println(user==user1);
		
		System.out.println(user.equals(user1));
	}

}
