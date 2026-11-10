package com.loop9;

import java.util.Scanner;

public class EmployeeAge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter the age of the employee");
        int age = scan.nextInt();

        scan.nextLine(); // Consume the leftover newline

        System.out.println("Please enter the name of the employee");
        String name = scan.nextLine();

        System.out.println("Please enter the salary of the employee");
        double salary = scan.nextDouble();

        System.out.println("The age of the employee is = " + age);
        System.out.println("The name of the employee is = " + name);
        System.out.println("The salary of the employee is = " + salary);

        scan.close();
    }
}