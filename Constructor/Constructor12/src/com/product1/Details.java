package com.product1;

public class Details {

    public static void main(String args[]) {

        Product acc = new Product("Telephone", 20000, "Its a good Telephone", 2);
        System.out.println(acc.name + " " +acc.price + " " + acc.description + " " + acc.quantity);

        Product acc1 = new Product("celephone", 3);
        System.out.println(acc1.name + " " + acc1.quantity);

        Product acc2 = new Product();

        System.out.println(acc2.description);
    }
}

