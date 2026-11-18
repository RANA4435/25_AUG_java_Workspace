
package com.exception.handling1;

public class ATM {

    public static void main(String[] args) {

        System.out.println("Start Main");

        ATM atm = new ATM();

        String[] accountDetails = {"1000", "Savings"};

        atm.withdrawAmount("1234", "500", accountDetails);

        System.out.println("End Main");
    }

    public void withdrawAmount(String pin, String amount, String[] accountDetails) {

        System.out.println("Started the withdraw method");

        boolean result = validateTransaction(pin, amount, accountDetails);

        if (result) {
            System.out.println("Transaction successful");
        } else {
            System.out.println("Transaction failed");
        }

        System.out.println("The End of the Withdraw method");
    }

    private boolean validateTransaction(String pin, String amount, String[] accountDetails) {

        try {

            // 1. Check PIN for null
            System.out.println("PIN length = " + pin.length());

            // 2. Check PIN length
            if (pin.length() != 4) {
                System.out.println("PIN must contain exactly 4 digits");
                return false;
            }

            // 3. Convert PIN into integer
            int number = Integer.parseInt(pin);

            // 4. Check amount for null
            System.out.println("Amount length = " + amount.length());

            // 5. Convert amount into integer
            int withdrawalAmount = Integer.parseInt(amount);

            // 6. Check withdrawal amount
            if (withdrawalAmount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero");
            }

            // 7. Access second element
            System.out.println("Account type = " + accountDetails[1]);

            // 8. Convert account balance
            int balance = Integer.parseInt(accountDetails[0]);

            // 9. Check sufficient balance
            if (withdrawalAmount <= balance) {

                System.out.println("PIN verified = " + number);
                System.out.println("Withdrawal amount = " + withdrawalAmount);
                System.out.println("Available balance = " + (balance - withdrawalAmount));

                return true;

            } else {

                System.out.println("Insufficient account balance");
                return false;
            }

        } catch (NullPointerException e) {

            System.out.println("PIN, amount or account details should not be null");
            e.printStackTrace();

        } catch (NumberFormatException e) {

            System.out.println("Please enter valid numeric values");
            e.printStackTrace();

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Account details array does not contain the required element");
            e.printStackTrace();

        } catch (IllegalArgumentException e) {

            System.out.println("Invalid withdrawal amount: " + e.getMessage());
            e.printStackTrace();
        }

        return false;
    }
}
