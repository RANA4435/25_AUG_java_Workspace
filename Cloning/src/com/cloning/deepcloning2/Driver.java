package com.cloning.deepcloning2;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Company company = new Company("vedanta", "Bangalore");
		
		Project project = new Project("SelfLearner", 20, company);
		
		Project clonedObj = (Project) project.clone();
		
		System.out.println(clonedObj.company.companyLocation);
		System.out.println(project.company.companyLocation);
		
		project.company.companyLocation="Ranchi";
		System.out.println("After deep cloning.."+clonedObj.company.companyLocation);
		System.out.println("After deep cloning..."+project.company.companyLocation);
	}

}
