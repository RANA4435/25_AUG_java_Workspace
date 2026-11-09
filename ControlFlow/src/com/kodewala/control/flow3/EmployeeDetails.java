package com.kodewala.control.flow3;

public class EmployeeDetails {
	String name;
	String accNo;
	String department;
	
	static int companyCode=1450;
	
	
	public void assign() {
		
		name="kamdev";
		accNo="36129887217";
		department="AIIT";
		
		System.out.println("The name of the employee is ="+name);
		System.out.println("The account number of the employee is ="+accNo);
		System.out.println("Department="+department);
		System.out.println("The company code for the employee is="+EmployeeDetails.companyCode);
	}

	public static void main(String[] args) {
		EmployeeDetails details = new EmployeeDetails();
		details.assign();
		

	}

}
