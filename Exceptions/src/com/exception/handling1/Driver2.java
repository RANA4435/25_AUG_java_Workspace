package com.exception.handling1;

public class Driver2 {
	public static void main(String[] args) {
		//String name=null;
		//System.out.println("Finding the length of the name="+name.length());
		
		String className="com.exception.handling1.Driver22";
		//Class.forName(className);
		try {
			Class.forName(className);//Loading the class into memory
			System.out.println("Class loaded...");
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class not fount for the class name=(com.exception.handling1;.Driver22)");
			e.printStackTrace();
			
		}
	}

}
