package Chapter4;

import Chapter2.AskUserForInput;

public class SoftwareSales {
    private int unitsSold;


    public String displayInfo() {
        int units = getUnitsSold();

        int percentageDiscount = caclulateDiscount(units);

        return "Your order has been allotted a "+
                percentageDiscount+
                "% discount!\n"+
                "Your grand total = "+
                "$"+
                applyDiscount(percentageDiscount, units);
    }

    //region Methods for calculating correct output.
    public int caclulateDiscount(int numOfUnits) {
        int percentage = 0;

        if (numOfUnits >= 10 && numOfUnits <= 19) {
            percentage = 20;
        }else if(numOfUnits > 19 && numOfUnits <= 49) {
            percentage = 30;
        }
        else if(numOfUnits > 49 && numOfUnits <= 99) {
            percentage = 40;
        }
        else percentage = 50;

        return percentage;
    }

    public double applyDiscount(double discountRate, int units) {
        // Turn the whole percentage number in to a decimal.
        discountRate = discountRate/100.00;

        double total = calculateTotal(units);

        total = ( (total) - (total * discountRate) );

        return total;
    }
    public double calculateTotal(int units) {
        final double pricePerUnit = 99.00;
        return (units * pricePerUnit);
    }
    //endregion

    //region Methods used for user input to the object's field
    public void validateInput() {
        int anInt = 0;
        do {
            anInt = promptUserAndReturnInput();
            if (anInt < 0) {
                System.out.println(
                        "The amount of software packages sold may not be negative");
                System.out.println("Please try again.");
            }
        }while( anInt < 0 );
        setUnitsSold(anInt);
    }
    public int promptUserAndReturnInput() {
        return AskUserForInput.askUserForInteger(
                "Please enter the amount of software packages sold."
        );
    }
    //endregion

    //region Accessors and mutators
    public int getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }
    //endregion
}
