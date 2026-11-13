package com.string.concat3;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder string = new StringBuilder();
		string.append("Kamdev");
		string.append(" rana");
		//Without Creating the new object it is giving you the new object that is why we use the StringBuilder and the StringBuffer
		
		System.out.println(string);
		//How do we convert the StringBuilder to String
		
		String result=string.toString();
		System.out.println(result);
		
		
		
	}

}
