package com.kodewala.constructor.debug;

class A {
	A(){
		System.out.println("A");
	}

}
class B{
	B(){
		System.out.println("B");
	}
	B(int x){
		this();
		System.out.println("C");
	}
	public static void main(String[] args) {
		new B(5);
	}
}
