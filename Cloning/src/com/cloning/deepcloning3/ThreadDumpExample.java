package com.cloning.deepcloning3;
public class ThreadDumpExample {

    public static void main(String[] args) {

        System.out.println("Main thread started");

        for (int i = 1; i <= 1000000000; i++) {

            System.out.println("Count: " + i);
         

        }
        

        System.out.println("Main thread completed");
    }
}