package chapter6;

import java.io.IOException;

public class CashRegisterDriver {
    public static void main(String[] args) throws IOException {
        demonstration();
    }

    public static void demonstration() throws IOException {
        RetailItem item0 = new RetailItem(
                "Electric Drill",
                250,
                145.99,
                125.00);

        // The user is not automatically asked to enter the quantity,
        // rather, if an invalid quantity (greater than unitsOnHand)
        // is passed to the CashRegister a loop is called until
        // valid data is entered.
        CashRegister transaction0 = new CashRegister(item0, 2);
        System.out.println(" Subtotal = "+
                transaction0.formatCurrencyToUSD(transaction0.getSubtotal()));
        System.out.println(" Tax = "+
                transaction0.formatCurrencyToUSD(transaction0.getTax()));
        System.out.println(" Total = "+
                transaction0.formatCurrencyToUSD(transaction0.getTotal()));

        // Print a demonstration of the above to a receipt.
        transaction0.printReceiptToFile();
    }

}
