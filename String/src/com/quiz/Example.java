package com.quiz;

public class Example {

	public static void main(String[] args) {
		String s1= "Java";   //scp 
		
		  final String s2 = new String("Java"); //scp and heap two objects created //
		//  final String s3 = new String("Java"); //
		 	
//		String s4 = s2+s3; // String s4="Java KamDev"//object will created in HEAP ONLY
//		
//		System.out.println("s1.equals(s2) :"+s1.equals(s2));
		
			/*
			 * String str1 = "kamdev"; String str2 = new String("kamdev");
			 */
		
		System.out.println(s2 == s1);
		
	}
}
