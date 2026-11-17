package com.clone2;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Manager manage =  new Manager("kamdev", "kd154w35", 120090);
		
		Manager cloneObj = (Manager) manage.clone();
		System.out.println(cloneObj.id);
		
	}

}
