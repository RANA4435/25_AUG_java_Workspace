package com.inheritence1;

class Employee//Parents class
{
	int  salary=20000;
	String name="Rana";
	String address="Bangalore";
	private String empCode="ID65474";// this String attributes will not be access outside the class 
	
	public void markIn(String empId) {
		System.out.println("Mark In "+empId);
	}
}
class Manager extends Employee// Manager Is-A is child class of Employee
{
	public void doSomething()
	{
		System.out.println(name);
		System.out.println(address);
		//System.out.println(empCode);
		//System.out.println(salary);

		markIn(address);
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager=new Manager();//creating an object 
		
		manager.doSomething();//giving control access

	}

}
