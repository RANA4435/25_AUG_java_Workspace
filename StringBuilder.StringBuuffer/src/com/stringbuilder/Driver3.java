package com.stringbuilder;

public class Driver3 {

	public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Kodewala");
        
        for(int i=0;i<=10;i++) {
        	sb.append("Academy "+i);
        }
        System.out.println(sb );
	}

}
