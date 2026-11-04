
package com.cloning.deepcloning;

public class Employee implements Cloneable {

    String name;
    String userID;
    Address address;

    public Employee(String name, String userID, Address address) {
        super();
        this.name = name;
        this.userID = userID;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        Employee e = (Employee) super.clone();

        // Deep cloning of Address object
        e.address = (Address) address.clone();

        return e;
    }
}
