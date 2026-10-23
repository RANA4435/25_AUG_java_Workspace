
package com.abstraction1;

abstract class Animal {

    abstract void sound();
    

}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Driver {

    public static void main(String[] args) {

        Animal a1 = new Dog();
        a1.sound();

        Animal a2 = new Cat();
        a2.sound();
    }
}
