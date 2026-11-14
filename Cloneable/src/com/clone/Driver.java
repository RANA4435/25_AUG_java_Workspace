package com.clone;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		AccountClone acc  = new AccountClone("Kamdev","jhgdk254");
		
		AccountClone clonedOb = (AccountClone) acc.clone();
		
		System.out.println(clonedOb.name);
		
		if(acc instanceof Cloneable) 
		{
			System.out.println("Aloow to perform the cloning");
		}else {
			System.out.println("not allowed to perform the cloning");
		}
			
		
	}

}
