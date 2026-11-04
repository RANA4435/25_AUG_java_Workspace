
package com.cloning.shallow1;

public class Animal implements Cloneable {

    String name;
    String colour;
    Grass grass;

    public Animal(String name, String colour, Grass grass) {
        super();
        this.name = name;
        this.colour = colour;
        this.grass = grass;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
