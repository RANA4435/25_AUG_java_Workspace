package com.cloning.shallow2;

public class Employee  implements Cloneable{
	String empName;
	String empId;
	Department department;
	public Employee(String empName, String empId, Department department) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.department = department;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		}

}
