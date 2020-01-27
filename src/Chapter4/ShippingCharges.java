package Chapter4;

import Chapter2.AskUserForInput;

import java.text.NumberFormat;
import java.util.Locale;

public class ShippingCharges {
    // Weight in kilograms
    private int weight;
    private int distance;


    //region Displaying the fields and calculations of charges.
    public String statement() {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        return " Your item weight in kilograms = " +
                getWeight() + '\n' +
                " The distance to be shipped in miles = " +
                getDistance() + '\n' +
                " Your total charges = " +
                format.format(applyCharges());
    }
    //endregion


    //region Methods for calculating the shipping charges
    // based on the weight and the distance shipped per 500 miles.
    public double applyCharges() {
        return (calculateRateFromDistance() * calculateRateFromWeight());
    }

    public double calculateRateFromDistance() {
        double distanceCharge = getDistance() / 500;
        double extraDistanceCharge = getDistance() % 500;
        if (extraDistanceCharge == 0)
            return distanceCharge;
        else return ++distanceCharge;
    }

    public double calculateRateFromWeight() {

        if ((getWeight() > 0) && (getWeight() <= 2))
            return 1.10;
        else if ((getWeight() > 2) && (getWeight() <= 6))
            return 2.20;
        else if ((getWeight() > 6) && (getWeight() <= 10))
            return 3.70;
        else return 4.80;
    }
    //endregion

    //region Methods used for field input
    //region Methods for input of weight field
    public void inputWeight() {
        setWeight(askForWeight());
    }

    public int askForWeight() {
        int userAnswer = 0;
        do {
            userAnswer = AskUserForInput.askUserForInteger(promptWeightInput());
            if (userAnswer < 0) {
                System.out.println("The weight of the item may not be less" +
                        " than 0.");
            }
        } while (userAnswer < 0);
        return userAnswer;
    }

    public String promptWeightInput() {
        return "Enter the weight of the item.";
    }
    //endregion

    //region Methods for input of distance field.
    public void inputDistance() {
        setDistance(askForDistance());
    }

    public int askForDistance() {
        int userAnswer = 0;
        do {
            userAnswer =
                    AskUserForInput.askUserForInteger(promptDistanceInput());
            if (userAnswer < 0) {
                System.out.println("The distance for the item to be shipped" +
                        " may not be less than zero.");
                System.out.println("Please try again.");
            }
        } while (userAnswer < 0);
        return userAnswer;
    }

    public String promptDistanceInput() {
        return "Enter the shipping distance in miles.";
    }
    //endregion
    //endregion


    //region accessors and mutators
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    //endregion
}
