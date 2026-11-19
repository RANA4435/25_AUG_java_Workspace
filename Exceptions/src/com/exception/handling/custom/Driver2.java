package com.exception.handling.custom;

import java.util.concurrent.ExecutionException;

public class Driver2 {
	public static void main(String[] args) throws ExecutionException {
		System.out.println("Started the main");
		Employee emp = new Employee();
		try {
			emp.registerEmployee(0, null, 0);
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("END of the main");
	}

}
