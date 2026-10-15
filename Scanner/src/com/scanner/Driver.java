package com.scanner;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the Name=");

        String name = sc.nextLine();

        System.out.println("Name : " + name);

        sc.close();
    }
}