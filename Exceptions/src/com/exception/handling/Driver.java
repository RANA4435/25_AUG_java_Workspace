
package com.exception.handling;

public class Driver {

    public static void main(String[] args) {

        System.out.println("main Started");

        Driver driver = new Driver();

        driver.doSomething();

        System.out.println("The End of the main");

    }

    public void doSomething() {

        System.out.println("Started doSomething");

        String name = null;
        int number=100;

        try {//Contains the code that might generate an exception.
              //Risk-code 
        	System.out.println(100/2);
            System.out.println(name.length());

            System.out.println("The length of the name");

        }
        catch (NullPointerException e) {//Handles the exception if it occurs inside the try block.

            System.out.println("The name is null it wont have any length");

            e.printStackTrace();

        }catch(ArithmeticException e) {
        	System.out.println("The number 100 can  divisible 2");
        	e.printStackTrace();
        	
        }

        System.out.println("Ended the doSomething");

    }

}

