package com.kodewala.control.flow2;

public class Discount{

    public static void main(String[] args) {

        Discount ecom = new Discount();

        String customerType = args[0];
        int amount = Integer.parseInt(args[1]);

        ecom.applyDiscount(customerType, amount);
    }

    public void applyDiscount(String customerType, int amount) {

        if (amount < 1000) {

            System.out.println("Minimum purchase should be 1000");

        } else {

            double discount = 0;

            switch (customerType.toLowerCase()) {

            case "gold":
                discount = amount * 20 / 100.0;
                break;

            case "silver":
                discount = amount * 10 / 100.0;
                break;

            case "regular":
                discount = amount * 5 / 100.0;
                break;

            default:
                System.out.println("Invalid customer type");
                return;
            }

            if (discount > 2500) {
                discount = 2500;
            }

            double finalAmount = amount - discount;

            System.out.println("Customer Type: " + customerType);
            System.out.println("Purchase Amount: " + amount);
            System.out.println("Discount: " + discount);
            System.out.println("Final Amount: " + finalAmount);
        }
    }
}