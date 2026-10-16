package com.kodewala.constructor.debug;

class Driver1{
    static int count = 0;

    Driver1() {
       count++;
        System.out.println("C");
    }

    Driver1(int age) {
        System.out.println(age);
    }
    Driver1(String name) {
        System.out.println(name);
    }


    public static void main(String[] args) {
        new Driver1();
        new Driver1(20);
        new Driver1("Satish");
        System.out.println(count);
    }
}
