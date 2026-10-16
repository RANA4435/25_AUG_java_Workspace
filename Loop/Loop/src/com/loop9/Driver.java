package com.loop9;

public class Driver {
	public static void main(String args[]) {
		int numbers[] = { 12, 45, 23, 12, 67, 34, 89, 45, 56, 23, 78, 12, 90, 34, 45, 67, 11, 56, 23, 89 };
		
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i]==89) {
				System.out.println(numbers[i]=89);
				break;
				
			}
		}
	}

}
