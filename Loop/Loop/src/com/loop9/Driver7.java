package com.loop9;

public class Driver7 {
	public static void main(String args[]) {
		int numbers[] = { 12, 45, 23, 12, 67, 34, 89, 45, 56, 23, 78, 12, 90, 34, 45, 67, 11, 56, 23, 89 };
		int highest=0;
		int secondHighest=0;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>highest) {
				secondHighest=highest;
				highest=numbers[i];
			}
		}
		System.out.println("Please Print the highset Number="+highest);
		System.out.println("Please Print the Second Highset Number="+secondHighest);

	}

}
