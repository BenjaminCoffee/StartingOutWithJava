package Chapter5;

import Chapter2.AskUserForInput;

import java.math.BigInteger;
import java.text.NumberFormat;

public class PenniesForPay {
    int days;

    public void wrapItUp() {
        inputDays();
        displayStatement();
    }
    public void displayStatement() {
        System.out.println(calculateStatement());
    }

    public String calculateStatement() {
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        String statement = "After working "+ getDays()+ " days you will have made "+
                defaultFormat.format(calculateDollars(calculatePennies()));
        return statement;
    }

    public double calculateDollars(long pennies) {
        return pennies / 100.00;
    }
    public long calculatePennies() {
        double daysWorked = getDays();
        long penniesForTheDay = 0;
        long sum = 0;

        for (int day = 1; day <= daysWorked; day++) {
            System.out.print("Pennies earned on day "+ day+ " = ");
            penniesForTheDay = (int) Math.pow(2, day);
            System.out.print(penniesForTheDay);

            System.out.println();

            System.out.print("Total pennies earned = ");
            sum = sum + penniesForTheDay;
            System.out.print(sum);

            System.out.println();
            System.out.println();

        }
        return sum;
    }

    public void inputDays() {
        setDays(receiveAndReturnDays());
    }

    public int receiveAndReturnDays() {
        return
        AskUserForInput.
                askUserForPositiveInteger(
                        "Starting at one penny and doubling each " +
                                "day," +
                                " enter the number of days worked: "
                );
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
