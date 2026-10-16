package com.kodewala.constructor11;

public class Driver {

    public static void main(String args[]) {

        Bank pp = new Bank(
            900000,
            "kamdev",
            "633573873687",
            "salman",
            "sandeep",
            "Successful",
            80000
        );

        System.out.println(pp.amount);
        System.out.println(pp.name);
        System.out.println(pp.accNo);
        System.out.println(pp.sender);
        System.out.println(pp.reciever);
        System.out.println(pp.successful);
        System.out.println(pp.balance);
    }
}