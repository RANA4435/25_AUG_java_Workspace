package com.exception.handling;

public class ArrayIndex {

    public static void main(String[] args) {

        System.out.println("The starting point of the main");

        ArrayIndex array = new ArrayIndex();

        array.doSomething(args);

        System.out.println("The Ending point of the main");
    }

    public void doSomething(String[] args) {

        System.out.println("Starting point of the doSomething");

        try {
            String name = args[0];
            String name1 = args[1];

            System.out.println("First argument = " + name);
            System.out.println("Second argument = " + name1);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Please pass at least two command-line arguments.");

            e.printStackTrace();
        }

        System.out.println("The end of the doSomething");
    }

	public ArrayIndex() {
		super();
	}
}