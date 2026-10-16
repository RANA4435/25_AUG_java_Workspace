package com.StudentDetails;

public class Details {
	
	public static void main(String args[]) {
		
		Sudent acc=new Sudent("kamdev",200,18,"a");
		System.out.println(acc.name+" "+acc.marks+" "+acc.age+" "+acc.section);
		
		Sudent acc1=new Sudent("salman",22);
		System.out.println(acc1.name+" "+acc1.age);
		
		Sudent acc2=new Sudent();
		System.out.println("Hello");
	}

}
