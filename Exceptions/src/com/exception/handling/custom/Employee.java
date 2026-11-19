package com.exception.handling.custom;

import java.util.concurrent.ExecutionException;

public class Employee {
	int empId;
	String empName;
	double salary;
	
	public void registerEmployee(int empId, String empName, double salary) throws InvalidSalaryException, ExecutionException {
		System.out.println("Started the registerEmployee");
		boolean result=validateSalary(salary);
		if(result) {
			System.out.println("Allowed to do ");
		}else {
			throw new InvalidSalaryException("Not valid");
		}
		System.out.println("END the registerEmployee");
		
	}
	private boolean validateSalary(double salary) {
		 salary=10000;
		 try {
			 if(salary>15000) {
				 System.out.println("Allowed to print the bill="+salary);
				 return true;
			 }else {
				 throw new InvalidSalaryException("Not allowed to print because the salary is less then 15000");
			 }
			 
			 }
		 catch(InvalidSalaryException e) {
			 System.out.println("");
		 }
		return false;
	}
}
