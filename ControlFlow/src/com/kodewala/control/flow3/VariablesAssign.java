
package com.kodewala.control.flow3;

public class VariablesAssign {

    int i = 100;
    int accNo;

    public void doAssign() {

        i = 100;
        accNo = 1000;

        System.out.println("The integer value which I assigned is = " + i);
        System.out.println("Account No = " + accNo);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Jharkhand");

        VariablesAssign variables = new VariablesAssign();

        variables.doAssign();
    }
}
