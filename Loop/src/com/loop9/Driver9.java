package com.loop9;

public class Driver9 {
	public static void main(String args[]) {
		int numbers[] = { 12, 45, 23, 12, 67, 34, 89, 45, 56, 23, 78, 12, 90, 34, 45, 67, 11, 56, 23, 89 };
		int lowest=numbers[0];
		int secondLowest=numbers[0];
		
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<lowest) {
				secondLowest=lowest;
				lowest=numbers[i];
				
			}
		}
		System.out.println("The Lowest Number In This Array is="+lowest);
		System.out.println("The  Second Lowest Number In This Array is="+secondLowest);

	}

}
