package Chapter5;

import Chapter2.AskUserForInput;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class AverageRainfall {
    public int timePeriodInYears;

    public String createStatement() {
        int inchesOfRain = calculateSumOfRainfall();
        return " Total number of months = " +
                (getTimePeriodInYears() * 12) + "\n" +
                " Total number of rainfall after " +
                getTimePeriodInYears() + " years = " +
                (inchesOfRain) + "\n"+
                " Average monthly rainfall = "+
                inchesOfRain / (getTimePeriodInYears() * 12);
    }
    public int askForMonthlyRainFall() {
        return AskUserForInput.askUserForPositiveInteger(
                "Enter the amount of rain fall" +
                        " in inches"
        );
    }

    public String displayRespectiveMonth(int monthNum) {

        if(monthNum >= 1 && monthNum <= 12) {
            Month theMonth = Month.of(monthNum);
            return theMonth.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        } else {
            System.out.println("Invalid data was entered in to" +
                    "the timePeriodInYears field, the program will now" +
                    "terminate.");
            System.exit(0);
        }
        return "";
    }
    public int calculateSumOfRainfall() {
        int rainfall = 0;

        for (int year = 1; year <= getTimePeriodInYears(); year++) {
            for (int month = 1; month <= 12; month++) {
                System.out.print(" Enter the rainfall for month, ");
                System.out.println(displayRespectiveMonth(month)+": ");
                rainfall = rainfall +
                        askForMonthlyRainFall();
            }
        }
        return rainfall;
    }
    public void inputTimePeriodInYears() {
        setTimePeriodInYears(askForYears());
    }

    public int askForYears() {
        return AskUserForInput.askUserForPositiveInteger(
                "Please enter the amount of time in years."
        );
    }

    public int getTimePeriodInYears() {
        return timePeriodInYears;
    }

    public void setTimePeriodInYears(int timePeriodInYears) {
        this.timePeriodInYears = timePeriodInYears;
    }
}
