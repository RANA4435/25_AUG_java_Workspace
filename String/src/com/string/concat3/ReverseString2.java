package com.string.concat3;

public class ReverseString2 {
	public static void main(String[] args) {
		String name="Rama";
		StringBuilder str= new StringBuilder(name);
		
		String reverse=str.reverse().toString();
		System.out.println("Print the reverse of the String name="+reverse);
		
	}

}
