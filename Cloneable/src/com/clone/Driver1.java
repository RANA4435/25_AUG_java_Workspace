package com.clone;

public class Driver1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee("Kamdev", 1000);
		
		Employee clonedObj = (Employee) emp.clone();
		
		System.out.println(clonedObj.name);
		
		if(emp instanceof Cloneable) {
			System.out.println("Allow to print the clone object");
		}else {
			System.out.println("You are not allowed to print the cloned object");
		}
	}

}
