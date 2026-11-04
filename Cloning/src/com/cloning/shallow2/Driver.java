package com.cloning.shallow2;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Department depart =  new Department("AIIT","Ground floor");
		
		Employee emp1 =  new Employee("KKR35","Kamdev",depart);
		
		Employee clonedObj = (Employee) emp1.clone();
		
		//emp1.department.location="5th florr";
		
		System.out.println(" Cloned Object before changing..."+clonedObj.department.location);
		System.out.println("Original before changing.."+emp1.department.location);
		
		
		emp1.department.location="5th florr";
		System.out.println("  after changing Cloned Object ..."+clonedObj.department.location);
		System.out.println(" after changing Original before changing.."+emp1.department.location);

	}

}
