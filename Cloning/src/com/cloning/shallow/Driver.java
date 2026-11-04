package com.cloning.shallow;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("Ranchu 2nd","Hazaribagh 1st","Barhi");
		
		Employee employee = new Employee("Kamdev","KGR254543",address);
		
		Employee clonedObj = (Employee) employee.clone(); //by default it will give you the shallow copy
		// because it is just copy the Address reference not the actual object of the Address class
		
		employee.address.city ="Hyd";
		
		System.out.println(employee.address.city);
		System.out.println(clonedObj.address.city);
		

	}

}
