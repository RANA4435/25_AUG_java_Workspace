package com.loop9;

public class Driver10 {

	public static void main(String[] args) {
		int numbers[] = { 12, 45, 23, 12, 67, 34, 89, 45, 56, 23, 78, 12, 90, 34, 45, 67, 11, 56, 23, 89 };
		int count=numbers[0];
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<40) {
				count++;
			}
		}
		System.out.println("The Numbers OF Student Who Got Less Then 40="+count);

	}

}
