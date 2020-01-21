package Chapter5;

import Chapter2.AskUserForInput;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class AverageRainfallDriver {
    public static void main(String[] args) {
        AverageRainfall rainfall0;
        rainfall0 = new AverageRainfall();

        // Input an amount in to the data field.
        //rainfall0.inputTimePeriodIYears();

        rainfall0.setTimePeriodInYears(1);
        System.out.println(rainfall0.createStatement());

        // Calculate the average rain fall for that period of time.

    }
}
