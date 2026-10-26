package com.polymorphism.Overriding.run.time;
class Employee{
	public void salary() {
		System.out.println("The employee...");
	}
}
class  Manager extends Employee{
	@Override
	public void salary() {
		System.out.println("The employee Manager...");
	}
}
class Developer extends Employee{
	@Override
	public void salary() {
		System.out.println("The employee Deveolper ..");
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Employee emp = new Employee();
//		emp.salary();
//		
		Employee emp1 = new Developer();
		emp1.salary();

	}

}
