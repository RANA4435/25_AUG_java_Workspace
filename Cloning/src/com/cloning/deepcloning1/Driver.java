package com.cloning.deepcloning1;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Address address =  new Address("Ranchi","Jharkhand","India");
		
		Student student = new  Student(1,"Kamdev",address);
		
		Student clonedObj = (Student) student.clone();
		
		student.address.city="Bangalore";
		
		System.out.println("Deep cloned."+clonedObj.address.city);
		System.out.println("Deep original."+student.address.city);

	}

}
