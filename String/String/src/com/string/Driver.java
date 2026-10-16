package com.string;

public class Driver {

	public static void main(String[] args) {
		//creating an object;
		String name="Kamdev";//here are two object but string constant pool will store only one because it will check that string is having the same content already exist ;
		String s="Kamdev";//this  both object is created using the literals;
		
		String kk=new String("BTM");//but thiss object is created using the new Keyword;
		 
		//System.out.println(kk);
		System.out.println(name==s);

	}

}
