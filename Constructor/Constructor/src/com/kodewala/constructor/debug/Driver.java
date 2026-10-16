package com.kodewala.constructor.debug;

class X {
	X(){
		System.out.println("A");
	}

}
class Z extends A{
	Z(){
		//super();//can not exist two keyword in the same class either it can be this or super
		this(10);
		System.out.println("B");
	}
	Z(int x){
		System.out.println("C");
	}
	public static void main(String[] args) {
		new B();
	}
}
