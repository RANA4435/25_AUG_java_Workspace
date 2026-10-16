package com.string;

public class Driver5 {
	public static void main(String[] args) {
		// creating an object using the literals
		// which will store in the SCP
		String s = "Rana";
		String k = "salman";
		String v = "Vishwajit";
		String s5 = "Rana";

		System.out.println(s == s5);// but in the literals if compare the address with equals == or with .equals it
									// will print the true if the address and the content are same
		System.out.println(s.equals(s5));

		System.out.println(s == k);

		// Creating an object using the new Keyword
		// Which will store in the heap

		String s1 = new String("Rana");
		String k1 = new String("Salman");// It will always create different object with new keyword but it will have one
											// Original copy in the scp;
		String s2 = new String("Rana");

		System.out.println(s == s1);
		System.out.println(s1 == s2);// == checks the address in the heap hence it will print the false because its
										// checking the address not the content
		System.out.println(s1.equals(s2));// .equals checks the content that "kamdev" -->"kamdev"
	}

}
