package com.loop8;

public class Driver {
	public static void main(String args[]) {
		int arr[] = { 10, -5, 20, -15, 30, -25, 40, -35, 50, -45, 60, -10, 70, -20, 80, -30, 90, -40, 100, -50 };
		for(int index=0; index<arr.length;index++) {
			int  number=arr[index];
			
			if(number<10) {
				continue;//continue the loop
			}
			System.out.println("Number is greater then 0="+number*10);
		}
	}

}
