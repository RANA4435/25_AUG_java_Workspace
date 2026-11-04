
package com.cloning.deepcloning;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("Ranchi 2nd", "Hazaribagh 1st", "Barhi");

		Employee employee = new Employee("Kamdev", "KGR254543", address);

		// Creating deep clone
		Employee clonedObj = (Employee) employee.clone();

		// Changing original object's city
		employee.address.city = "Hyd";

		System.out.println("Original Employee City: " + employee.address.city);

		System.out.println("Cloned Employee City: " + clonedObj.address.city);
	}
}
