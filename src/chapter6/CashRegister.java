package chapter6;

import chapter2.AskUserForInput;
import chapter5.HelpfulMethodsForFileIO;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CashRegister {
    private RetailItem item;
    private int quantity;

    // User validation is called within the constructor.
    public CashRegister(RetailItem item, int quantity) {
        this.item = item;
        while(!isQuantityAvailable(quantity)) {
            System.out.println("The maximum number of units" +
                    " in stock = " +
                    item.getUnitsOnHand()+
                    " please enter less than or equal to this amount of units.");
            quantity = askUserForUnits();
        }
        this.quantity = quantity;

    }

    // ensure the quantity being purchased is not more than
    // the quantity of the item available.
    public boolean isQuantityAvailable(int numOfItems) {
        if( numOfItems > this.item.getUnitsOnHand()) {
            return false;
        }
        return true;
    }

    public int askUserForUnits() {
        return AskUserForInput.askUserForPositiveInteger(
                "Enter Item quantity: "
        );
    }

    public double getTotal() {
        return (getSubtotal() + getTax());
    }

    public double getTax() {
        double retailTax = .06;

        return getSubtotal() * retailTax;
    }

    public String formatCurrencyToUSD(double amount) {
        Currency currencyInstance = Currency.getInstance("USD");
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        format.setCurrency(currencyInstance);

        return format.format(amount);
    }

    public void printReceiptToFile() throws IOException {

        // create a PrintWriter object equipped to create and write
        // to a new file.
        PrintWriter receiptWriter =
                HelpfulMethodsForFileIO.createNewFileAndWriteToIt(
                        "C:\\Users\\benja\\IdeaProjects" +
                                "\\StartingOutWithJava\\chapterSpecificFiles\\chapter6",
                        "receipt.txt"
                );

        // create the string we want to print to that newly created file.
        String statement = createReceiptString();

        // print the string to the new file.
        receiptWriter.print(statement);

        // we must always lose the PrintWriter object for anything to work.
        receiptWriter.close();
    }

    public String createReceiptString() {
        StringBuilder statement = new StringBuilder();
        statement.append("SALES RECEIPT\n");
        statement.append(" Subtotal = " +
                formatCurrencyToUSD(getSubtotal()) + "\n");
        statement.append(" Tax = " +
                formatCurrencyToUSD(getTax()) + "\n");
        statement.append(" Total = " +
                formatCurrencyToUSD(getTotal()));

        return statement.toString();
    }

    // getting the subtotal for a retail item
    public double getSubtotal() {
        double x = item.getCostRetail();

        return x * quantity;
    }

    public RetailItem getItem() {
        return item;
    }

    public void setItem(RetailItem item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
