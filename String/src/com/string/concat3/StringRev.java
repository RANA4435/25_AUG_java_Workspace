package com.string.concat3;

public class StringRev {
	public static void main(String[] args) {
		String sb="KARKA";
		
		StringBuilder str=new StringBuilder(sb);
		
		String reverse = str.reverse().toString();
		
		System.out.println("The reverse of the KARKA is="+reverse);
	}

}
