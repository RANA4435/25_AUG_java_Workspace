package com.string.concat;
class User {
	String name;

	public User(String name) {
		super();
		this.name = name;
	}
	
}

public class Driver1 {
	public static void main(String[] args) {
		
		//Creating the object using the literals 
		String csk="Chennai Super Kings";// these all the String will store in the SCP
		String pbks="Punjab Kings";
		String rcb="Royal Challengers Bangleru";
		String rr="Rajasthan Royal";
		String dd="Delhi Capitals";
		
		String pp="Chennai Super Kings";
		
		System.out.println(csk==pbks);//By using the == we are just checking the address of the object like "7353vnd"-->"574876vfj"
		System.out.println(csk.equals(pp));//By using the .equals we are just checking the contents are same or not in this object
		
		//Creating the object using the new Keyword by using the keyword new it is going to create every time new object
		String kk=new String("Bangalore");
		String ss=new String("Ranchi");
		String kr=new String("Hazaribagh");
		String sm=new String("Ranchi");
		
		String sm1=sm.concat(" Wala");//Using the concat you can  just modify the String but you cant the String becuse when you try to change the content the object you get but the first String will be same 
		System.out.println(sm1);
		
		System.out.println(kk==kr);//By using the == We are  checking that the address of the object is same or not "754874bb"-->"87674bnhfb" if the refferemce are same still it will print the false because one is comparing the address with the other and it is the new object 
		System.out.println(ss==sm);//== Due to this Still it will print the false because its a different object with same content but different refference;
		System.out.println(ss.equals(sm));//Now it will print the true because we are asking that the content are same in the object or not;
		
		User user=new User("Ranchi");
		User user1=new User("Giridih");
		User user2=new User("Ranchi");
		
		System.out.println(user==user2);//it will print the false
		System.out.println(user.equals(user2));//it will print the false because we haven't created the method overriding
	}

}
