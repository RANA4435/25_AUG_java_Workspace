package com.loop9;

public class Positive {
	public static void main(String[] args) {
		int i=0;
		for(i=0; i<=10;i++) {
			if(i%2==0) {
				System.out.println("The number is positive ="+i);
			}else {
				System.out.println("The Number is not positive ="+i);
			}
		}
	}

}
