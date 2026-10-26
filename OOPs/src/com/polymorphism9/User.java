package com.polymorphism9;

public class User {
    public static void main(String[] args) {
        UserCall user1 = new UserCall();//Always Remember this you have to call it whenever you are using the polymorphism for this
        Order order = new Order();// now i am calling the function by taking the refference 
        Order order1 = new Myntra();// here also doing the same things 
        order1.doorder("Red", 4);

        user1.doorder(order);
    }
}