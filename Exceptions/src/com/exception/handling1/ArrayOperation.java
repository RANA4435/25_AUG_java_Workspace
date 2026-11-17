package com.exception.handling1;

public class ArrayOperation {
	public static void main(String[] args) {
		System.out.println("Main started");
		ArrayOperation op = new ArrayOperation();
		op.doArray(null);
		System.out.println("Ended main");
	}
	public void doArray(int[] ar) {
		System.out.println("The start of the array main");
		int[] arr = {10,20,30,40};
		
		try {
		
		System.out.println("The value at the index of the 2 is ="+arr[2]);
		System.out.println(arr[0]);
		System.out.println(arr[4]);// here it will throws the exception
		System.out.println(arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("We are trying to acces the value of the index 2");
			e.printStackTrace();
		}
		try {
		System.out.println("The value at the index 5 is ="+arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("We are trying to acces the value of the index 5");
			e.printStackTrace();
		}
		try {
		System.out.println("The Array elements are "+arr);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("We are trying to access the value of the array");
			e.printStackTrace();
			
			
		}
		catch(Exception e) {
			
		}
		System.out.println("The End of the Array main");
	}

}
