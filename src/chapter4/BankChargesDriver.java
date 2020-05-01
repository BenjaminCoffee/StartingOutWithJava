package chapter4;

public class BankChargesDriver {
    /**
     * Entry point to application.
     * @param args
     */
    public static void main(String[] args) {
        bankChargesDemo();
    }

    /**
     * Demonstrates an instance of the bankCharges class.
     */
    public static void bankChargesDemo() {
        BankCharges charge0 = new BankCharges();

        // Initialize the checksUsed field
        charge0.assignChecksUsed();

        // Initialize the accountBalance field
        charge0.setAccountBalance(399.00);

        // Display the bank statement
        System.out.println(charge0.statement());
    }
}
