package com.cloning;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Address address = new Address("Ranchi 9th cross","Hazaribagh 2nd","Koderma");
		
		Employee emp = new Employee("Kamdev", "HH54758", address);
		
		Employee clonedOb =  (Employee) emp.clone();
		
		System.out.println(clonedOb.empCode);

	}

}
