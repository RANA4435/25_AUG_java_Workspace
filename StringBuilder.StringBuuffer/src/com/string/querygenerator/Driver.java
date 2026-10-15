package com.string.querygenerator;

public class Driver {

	public static void main(String[] args) {
      QueryGenarator sb=new QueryGenarator();
      
       StringBuilder result = sb.generateQuery(10000, null);
      
      System.out.println(result);
	}

}
