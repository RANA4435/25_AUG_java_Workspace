package com.string.concat3;

public class Concat {
	public static void main(String[] args) {
		String str1="java ";//But when we Write the static it will goes to compile time
		String str2= "kamdev";
		String str3 = str1 + str2 ;//At the runtime  it will create one object and this object will get created in the heap
		String str4 = "java kamdev";
		
		System.out.println(str3 == str4);//So it will print the false
		//but when you make the final you get true;instead  of the false because the object get created in the scp instead of the heap
		
	}

}
