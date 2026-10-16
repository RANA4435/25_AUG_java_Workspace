package com.kodewala.constructor;

class Super{
	Super(int a){
		
	}
}

public class Student {
	String name;
	String customerId;
	String behavior;
	int age;
	
	Student(String _name,String _customerId,String _behavior,int _age){
		this(900);
		this.name=_name;
		this.customerId=_customerId;
		this.behavior=_behavior;
		this.age=_age;
	}
	Student(int a){
		System.out.println("I can play the better cricket then anyone="+a);
	}
	Student(String _name, String _behavior){
		this.name=_name;
		this.behavior=_behavior;
	}
	Student(String _customer, int _age){
		this(400);
		this.customerId=_customer;
		this.age=_age;
	}
	Student( int _age,String _name){
		this.age=_age;
		this.name=_name;
	}
	Student(String _customerId){
		this.customerId=_customerId;
	}

}
