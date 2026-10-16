package com.string.concat2;

public class Driver3 {
	public static void main(String[] args) {
		//creating an object using literal
		String k="Ram"+"Raheem"+"God";
		
		System.out.println(k);
		String s="Sunil";//SCP
		String s1=" Yadav";//SCP
		
		System.out.println(s==s1);//false
		
		String s2=s+s1;//Heap
		
		
		System.out.println(s2);
		
		String s3="Sunil Yadav";//SCP
		System.out.println(s3==s2);
		
		System.out.println(s3==s2.intern());
		
	}

}
