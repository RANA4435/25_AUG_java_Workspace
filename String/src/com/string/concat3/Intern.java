package com.string.concat3;

public class Intern {
	public static void main(String[] args) {
		String s1="Kamdev";
	    String s2 =" Kamdev";
		//System.out.println(s1==s2);
		String s3=s1+s2;
		String s4="Kamdev Kamdev";
		System.out.println(s3==s4);
	}

}
