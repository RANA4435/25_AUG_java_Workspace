package com.string.querygenerator2;

public class Driver {

	public static void main(String[] args) {
       Genarate gg=new Genarate();
       StringBuilder result=gg.genarateQuery(21,"bg584",null,0);
       
       System.out.println(result);
	}

}
