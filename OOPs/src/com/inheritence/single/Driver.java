
package com.inheritence.single;

class Account {
    public void openAccount(String name) {
        System.out.println("OpenAccount..." + name);
    }
}

class SavingAccount extends Account {
    public void openSavingAccount(int age) {
        System.out.println("OpenSavingAccount..." + age);
    }
}

public class Driver {
    public static void main(String[] args) {

        SavingAccount acc = new SavingAccount();

        acc.openAccount("Kamdev");
        acc.openSavingAccount(25);
    }
}
