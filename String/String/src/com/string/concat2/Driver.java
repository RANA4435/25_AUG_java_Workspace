package com.string.concat2;

public class Driver {
	public static void main(String[] args) {
		String s1="This is "+"from "+"Kodewala";
		//here 1 object will be created due to of concatenation
		System.out.println(s1);
		
		String s2="Barhi";//scp
		String s3=" Hazaribagh";//scp
		
		String s4=s2+s3;//heap . it will not have any copy in the scp
		// so the final is 4 object is getting created here
		System.out.println(s4);
		
		String s5="Barhi Hazaribagh";
		
		System.out.println(s5==s4);//false
		//but by using intern() you will get the true because it start referring that the Barhi Hazaribagh exist or not
		
		System.out.println(s5==s4.intern());
		
		
	}

}
