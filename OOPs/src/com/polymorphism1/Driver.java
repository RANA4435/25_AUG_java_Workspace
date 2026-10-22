package com.polymorphism1;
class Employee{
	public void markIn() {
		System.out.println("MarkIn the Attendence of the Employee..");
	}
}
class HRManager extends Employee{
	@Override
	public void markIn() {
		System.out.println("MarkIn the attendence of the HR Manager..");
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee emp = new Employee();
//		emp.markIn();
//		
		Employee emp1 = new HRManager();//parents class is reffering the child class 
		emp1.markIn();//same method will behave differently based on the situation 
		//at the time of compilation it will check the method exist in the class
		//at the time of execution(while running )it will call the actual method
		//the first preference will given to the object class

	}

}
