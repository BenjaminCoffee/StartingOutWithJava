package Chapter4;

import Chapter2.AskUserForInput;

import java.text.NumberFormat;
import java.util.Locale;

public class MobileServiceProvider {
    private char servicePackage;
    private int minutes;

    public void wrapItUp() {
        inputServicePackage();
        inputMinutes();

        System.out.println(customerStatement());
    }
    public String customerStatement() {

        NumberFormat uSdCurrency = NumberFormat.getCurrencyInstance(Locale.US);

        return " Your service package = "+ getServicePackage()+ '\n'+
                " The minutes used = "+ getMinutes()+ '\n'+
                " Your total bill for this month = "+
                uSdCurrency.format(handleServicePackageSelection());
    }
    public double handleServicePackageSelection() {
        if (getServicePackage() == 'A' ||
                getServicePackage() == 'B' ||
                getServicePackage() == 'C')
        {
            if(getServicePackage() == 'A') {
                return calculateBillForA();
            }
            if(getServicePackage() == 'B') {
                return calculateBillForB();
            }
            if(getServicePackage() == 'C') {
                return calculateBillForC();
            }
        }
        else {
            System.out.println("There has been an error in setting the" +
                    " servicePackage field.");
        }
        return 0;
    }

    public double calculateBillForC() {
        double bill = 69.99;

        return ( bill );
    }
    public double calculateBillForB() {
        double bill = 59.99;
        if(getMinutes() <= 900) {
            return bill;
        }
        double additionalChargeForMinutes =
                ( (getMinutes() - 900) * (0.40) );

        return ( bill + additionalChargeForMinutes );
    }
    public double calculateBillForA() {
        double bill = 39.99;
        if(getMinutes() <= 450) {
            return bill;
        }
        double additionalChargeForMinutes =
                ( (getMinutes() - 450) * (0.45) );

        return ( bill + additionalChargeForMinutes );
    }
    public void inputMinutes() {
        setMinutes(validateInputForMinutes());
    }
    public int validateInputForMinutes() {
        int userInput;

        do {
            userInput = AskUserForInput.askUserForInteger(
                    "Please enter the amount of minutes used:"
            );
            if(userInput < 0) {
                System.out.println("You may not enter a negative number.");
            }
        }while(userInput < 0);

        return userInput;
    }
    public void inputServicePackage() {
        setServicePackage(validateInputForServicePackage());
    }
    public char validateInputForServicePackage() {
        char userInput;

        do {
            userInput = AskUserForInput.askUserForChar(
                    "Please enter the character " +
                            "associated with the service package:"
            );
            if(userInput != 'A' && userInput != 'B' && userInput != 'C') {
                System.out.println("That is not a valid entry..." +
                        " Please select 'A', 'B' or 'C'.");
            };
        }while(userInput != 'A' && userInput != 'B' && userInput != 'C');

        return userInput;
    }

    public char getServicePackage() {
        return servicePackage;
    }

    public void setServicePackage(char servicePackage) {
        this.servicePackage = servicePackage;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
