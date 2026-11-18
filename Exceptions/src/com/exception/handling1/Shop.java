
package com.exception.handling1;

public class Shop {

    public static void main(String[] args) {

        System.out.println("Starting main");

        Shop shop = new Shop();

        int[] price = {10, 20, 30};

        shop.placeOrder(null, null, price);

        System.out.println("End of the main");
    }

    public void placeOrder(String productName, String quantity, int[] prices) {

        System.out.println("doPlaceOrder");

        boolean result = validateOrder(productName, quantity, prices);

        if (result) {
            System.out.println("Place Order is Successful");
        } else {
            System.out.println("Placing Order is failed");
        }

        System.out.println("doPlaceOrder End");
    }

    private boolean validateOrder(String productName, String quantity, int[] prices) {

        try {

            System.out.println("Print the length of productName = " + productName.length());

            int quantity1 = Integer.parseInt(quantity);

            System.out.println("Print the quantity = " + quantity1 / 0);

            int price = prices[3];

            System.out.println("Print the price of index 3 = " + price);

            return true;

        } catch (NullPointerException e) {

            System.out.println("Null value found");
            e.printStackTrace();
            

        } catch (NumberFormatException e) {

            System.out.println("Quantity must contain numbers only");
            e.printStackTrace();
            

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");
            e.printStackTrace();
            

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index");
            e.printStackTrace();
            

        } finally {

            System.out.println("Order validation completed");
        }

        return false;
    }
}
