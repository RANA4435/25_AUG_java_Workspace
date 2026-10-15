package com.string.querygenerator1;

public class Driver {

	public static void main(String[] args) {
		Generate gg=new Generate();
		 StringBuilder result=gg.generateQuery(100,null);
		
		System.out.println(result);

	}

}
