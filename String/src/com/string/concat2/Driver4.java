package com.string.concat2;

public class Driver4 {
	public static void main(String[] args) {
		String s1=new String("java");
		s1.intern();
		
		String s2="java";
		String s3=new String("java");
		
		System.out.println(s1==s3);
	}

}
