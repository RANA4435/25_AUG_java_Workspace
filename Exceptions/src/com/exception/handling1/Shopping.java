
package com.exception.handling1;

public class Shopping {

    public static void main(String[] args) {

        System.out.println("Main started");

        Shopping shop = new Shopping();

        int[] prices = {100, 200, 500};

        shop.placeOrder(null, "2", prices);

        System.out.println("The main End");
    }

    public void placeOrder(String productName, String quantity, int[] prices) {

        System.out.println("doShopping");

        boolean result = validateOrder(productName, quantity, prices);

        if (result) {
            System.out.println("Order placed successfully");
        } else {
            System.out.println("Order placement failed");
        }

        System.out.println("doShopping End");
    }

    private boolean validateOrder(String productName, String quantity, int[] prices) {

        try {

            // 1. Check product name
            System.out.println("Product name length = " + productName.length());

            // 2. Convert quantity into integer
            int quantity1 = Integer.parseInt(quantity);

            // 3. Validate quantity
            if (quantity1 <= 0) {
                throw new IllegalArgumentException(
                    "Quantity must be greater than zero"
                );
            }

            // 4. Access third element of prices array
            int price = prices[2];

            System.out.println("Product price = " + price);

            // 5. Calculate total price
            int totalPrice = quantity1 * price;

            System.out.println("Total price = " + totalPrice);

            return true;

        } catch (NullPointerException e) {

            System.out.println("Product name, quantity or prices should not be null");
            e.printStackTrace();

        } catch (NumberFormatException e) {

            System.out.println("Quantity must contain numeric values");
            e.printStackTrace();

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid price array index");
            e.printStackTrace();

        } catch (IllegalArgumentException e) {

            System.out.println("Invalid quantity");
            e.printStackTrace();

        } finally {

            System.out.println("Order validation process completed");
        }

        return false;
    }
}
