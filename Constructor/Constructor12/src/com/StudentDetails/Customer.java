package com.StudentDetails;

public class Customer {
		String name;
		int age; 
		int balance; 
		String gender; 
		
		Customer(String _name,int _age,int _balance,String _gender){
			this.name=_name;
			this.age=_age;
			this.balance=_balance;
			this.gender=_gender;
		}
		Customer(String _name,int _age){
			this.name=_name;
			this.age=_age;
			
		}
		Customer(int _balance,int _age){
			this.balance=_balance;
			this.age=_age;
			
			
		}
		Customer(String _gender,String _name){
			this.gender=_gender;
			this.name=_name;
			
		}
		Customer(){
			System.out.println("Hello");
		}
		Customer(String _name,int _balance,int _age){
			this.name=_name;
			this.balance=_balance;
			this.age=_age;
		}

}
