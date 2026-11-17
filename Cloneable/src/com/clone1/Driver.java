package com.clone1;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Details det = new Details("kamdev", 24, 1);
		
		Details clonedObj = (Details) det.clone();
		System.out.println(clonedObj.age);
		
		if(det instanceof Cloneable) {
			System.out.println("Allow to print the ");
		}else {
			System.out.println("Do not allow to print ");
		}
		
		
	}

}
