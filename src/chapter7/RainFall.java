package chapter7;

import chapter2.AskUserForInput;

import java.time.Month;

public class RainFall {
    private double[] year;

    public RainFall() {
        final int MONTHS = 12;
        year = new double[MONTHS];
        inputYearlyRainFall();

        System.out.println(toString());
    }

    private void inputYearlyRainFall() {
        for (int i = 0; i < year.length; i++) {
            StringBuilder prompt = new StringBuilder();
            prompt.append("Input monthly rainfall for ");
            prompt.append(castIntToMonth(i + 1) + ": ");
            year[i] = AskUserForInput.askUserForPositiveDouble(prompt.toString());
        }
    }

    public String castIntToMonth(int monthNum) {
        return Month.of(monthNum).toString();
    }

    public double getTotalRainFall() {
        double sum = 0;
        for (int i = 0; i < year.length; i++) {
            sum = sum + year[i];
        }
        return  sum;
    }

    public double getAverageRainfall() {
        return getTotalRainFall() / year.length;
    }

    public String getGreatestMonth() {
        double greatest = 0;
        int index = 0;
        for (int i = 0; i < year.length; i++) {
            if (year[i] > greatest) {
                greatest = year[i];
                index = i;
            }
        }
        return  castIntToMonth(index + 1);
    }

    public String getLeastMonth() {
        double least = 0;
        int index = 0;
        for (int i = 0; i < year.length; i++) {
            if (year[i] < least) {
                least = year[i];
                index = i;
            }
        }
        return  castIntToMonth(index + 1);
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Total rainfall for the year = ");
        str.append(getTotalRainFall() + "\n");
        str.append("Average monthly rainfall = ");
        str.append(getAverageRainfall() + "\n");
        str.append("Month with greatest rainfall = ");
        str.append(getGreatestMonth() + "\n");
        str.append("Month with the least rainfall = ");
        str.append(getLeastMonth());

        return str.toString();
    }
}
