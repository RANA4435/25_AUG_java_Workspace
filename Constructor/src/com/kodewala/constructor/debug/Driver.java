package com.kodewala.constructor.debug;

class A {
	A(){
		System.out.println("A");
	}

}
class B{
	B(){
		//super();//can not exist two keyword in the same class either it can be this or super
		this(10);
		System.out.println("B");
	}
	B(int x){
		System.out.println("C");
	}
	public static void main(String[] args) {
		new B();
	}
}
