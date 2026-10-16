package com.StudentDetails;

public class Details3 {
	public static void main(String args[]) {
//		String name;
//		int age; 
//		int balance; 
//		String gender; 
		
		Customer acc=new Customer("Ram",24,1000,"M");
		System.out.println(acc.name+" "+acc.age+" "+acc.balance+" "+acc.gender);
		
		
		Customer acc1=new Customer("male", "Sanjay");
		System.out.println(acc1.gender+" "+acc1.name);
		
		
		Customer acc2=new Customer(563663,22);
		System.out.println(acc2.balance+" "+acc2.age);
		
		Customer acc3=new Customer(33, 778766);
		System.out.println(acc3.age+" "+acc3.balance);
		
		Customer acc4=new Customer("Sunil",27);
		System.out.println(acc4.name+" "+acc4.age);
		
		Customer pp=new Customer("Rajesh",17,100,"male");
		System.out.println(pp.name+" " +pp.age+" "+pp.balance+" "+pp.gender);
		
		Customer kkr=new Customer("Rana",90000,24);
		System.out.println(kkr.name+" "+kkr.balance+" "+kkr.age);
		
		Customer kk=new Customer();
		System.out.println("hello");
				
		
	}

}
