package com.stringbuilder;

public class Driver {

	public static void main(String[] args) {
       StringBuilder sb=new StringBuilder("Kodewla");//StringBuilder object-->mutable
       //"Kodewala"-->this will store in the scp
       //With new keyword the 
       sb.append("Academy");//this stoere in the heap
       
       System.out.println(sb);
	}

}
