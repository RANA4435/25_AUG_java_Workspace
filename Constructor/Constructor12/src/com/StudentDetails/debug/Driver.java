package com.StudentDetails.debug;
class Parent {
    Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    Child() {
        //this(10);
        System.out.println("Child default");
    }

    Child(int x) {
        System.out.println("Child parameterized");
    }
}

public class Driver {
    public static void main(String[] args) {
        new Child();
    }
}
