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

        return " Your service package = " + getServicePackage() + '\n' +
                " The minutes used = " + getMinutes() + '\n' +
                " Your total bill for this month = " +
                uSdCurrency.format(handleServicePackageSelection()) + '\n' +

                // This line of code was added as part of programming challenge #12 solution.
                returnSavings();
    }


    //region - These methods were added as part of the solution to
    // programming challenge #12.
    public String returnSavings() {
        NumberFormat uSdCurrency = NumberFormat.getCurrencyInstance(Locale.US);

        String statement;
        if (willMoneyBeSavedWithDifferentPlan() == true) {
            statement = " You could have saved " +
                    uSdCurrency.format(
                            handleServicePackageSelection() -
                                    returnLowestServicePackageBill()) +
                    " if service package " +
                    whichServicePackageWillReturnSavings() +
                    " had been selected.";
        } else statement = null;

        return statement;
    }

    public char whichServicePackageWillReturnSavings() {
        if (returnLowestServicePackageBill() == calculateBillForA()) {
            return 'A';
        }
        if (returnLowestServicePackageBill() == calculateBillForB()) {
            return 'B';
        } else return 'C';
    }

    public boolean willMoneyBeSavedWithDifferentPlan() {
        if (handleServicePackageSelection() > calculateBillForA() ||
                handleServicePackageSelection() > calculateBillForB() ||
                handleServicePackageSelection() > calculateBillForC())
            return true;
        else return false;
    }

    public double returnLowestServicePackageBill() {
        double a = calculateBillForA();
        double b = calculateBillForB();
        double c = calculateBillForC();

        double min = a;

        if (b < min)
            min = b;

        if (c < min)
            min = c;

        return min;
    }
    //endregion


    //region - Methods for calculating the appropriate output
    public double handleServicePackageSelection() {
        // If the value for `getServicePackage()` isn't changing, there's no need to re-call the method over and over again. Instead just save the result
        final char servicePackage = getServicePackage()
        if (servicePackage == 'A' ||
                servicePackage == 'B' ||
                servicePackage == 'C') {
            if (servicePackage == 'A') {
                return calculateBillForA();
            }
            if (servicePackage == 'B') {
                return calculateBillForB();
            }
            if (servicePackage == 'C') {
                return calculateBillForC();
            }
        } else {
            System.out.println("There has been an error in setting the" +
                    " servicePackage field.");
        }
        return 0;
    }

    public double calculateBillForC() {
        double bill = 69.99;

        return bill; // you could also just have `return 69.99`
    }

    public double calculateBillForB() {
        double bill = 59.99;
        if (getMinutes() <= 900) {
            return bill;
        }
        double additionalChargeForMinutes =
                ((getMinutes() - 900) * (0.40));

        return (bill + additionalChargeForMinutes);
    }

    public double calculateBillForA() {
        double bill = 39.99;
        if (getMinutes() <= 450) {
            return bill;
        }
        double additionalChargeForMinutes =
                ((getMinutes() - 450) * (0.45));

        return (bill + additionalChargeForMinutes);
    }
    //endregion


    //region - Methods for receiving input to the minutes field.
    public void inputMinutes() {
        setMinutes(validateInputForMinutes());
    }

    public int validateInputForMinutes() {
        int userInput;

        do {
            userInput = AskUserForInput.askUserForInteger(
                    "Please enter the amount of minutes used:"
            );
            if (userInput < 0) {
                System.out.println("You may not enter a negative number.");
            }
        } while (userInput < 0);

        return userInput;
    }
    //endregion


    //region - Methods for receiving input to the servicePackage field.
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
            if (userInput != 'A' && userInput != 'B' && userInput != 'C') {
                System.out.println("That is not a valid entry..." +
                        " Please select 'A', 'B' or 'C'.");
            }
        } while (userInput != 'A' && userInput != 'B' && userInput != 'C');

        return userInput;
    }
    //endregion


    //region - Setters and getters
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
    //endregion
}
