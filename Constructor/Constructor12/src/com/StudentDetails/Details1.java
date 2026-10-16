package com.StudentDetails;

public class Details1 {
	public static void main(String args[]) {
		Parents acc=new Parents("kamdev",24,1000);
		System.out.println(acc.name+" "+acc.age+" "+acc.marks);
		
		Parents acc1 =new Parents("Amir",89);
		System.out.println(acc1.name+" "+acc1.marks);
		
		
		Parents acc2=new Parents();
		System.out.println("hello");
		
		Parents acc3=new Parents("salman",89);
		System.out.println(acc3.name+" "+acc3.marks);
	}

}
