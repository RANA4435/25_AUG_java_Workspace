package com.string.concat;

public class Driver {
	public static void main(String[] args) {
		String s="Rana";//This is String with the literals so it will store in the SCP
		
		String s2=s.concat(" Jii");//Creating or modifying Using the concat whic will give the other object that will holds the different content
		//String s3=s2.concat("  Shaadi Mubarakho");
		String s3=s2.concat("  \n Shaadi sampan hua");
		System.out.println(s3);//It will store in the heap
	}

}
