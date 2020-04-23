package chapter7;

import chapter5.HelpfulMethodsForFileIO;
import java.io.IOException;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class GasPrices {
    private double[] yearPrices;

    public GasPrices() throws IOException {
        // reserve enough indices needed in the class' array field.
        yearPrices = new double[getIndicesNeeded()];
        inputGasPrices();
        System.out.println(getLowest());
        System.out.println(getHighest());
        System.out.println(getAverage());

    }

    // This method is incomplete.
    public String getAverage() {
        double sum = 0;
        double average = 0;
        StringBuilder str = new StringBuilder();
        int index = 0;
        for (int i = 0; i < yearPrices.length; i++) {
            // sum each index
            sum = sum +  yearPrices[i];
            if ((i + 1) == 5) {
                str.append(" Average weekly price for ");
                str.append(getMonthNameFromInt(0));
                str.append(" = ");
                str.append(sum / 5);
                str.append("\n");
            } else if ((i + 1) == 9) {
                str.append(" Average weekly price for ");
                str.append(getMonthNameFromInt(1));
                str.append(" = ");
                str.append(sum / 4);
                str.append("\n");
            } else if ((i + 1) == 13) {
                str.append(" Average weekly price for ");
                str.append(getMonthNameFromInt(1));
                str.append(" = ");
                str.append(sum / 4);
                str.append("\n");
            } else if ((i + 1) == 17) {
                str.append(" Average weekly price for ");
                str.append(getMonthNameFromInt(2));
                str.append(" = ");
                str.append(sum / 4);
                str.append("\n");
            } else if ((i + 1) == 18) {
                str.append(" Average weekly price for ");
                str.append(getMonthNameFromInt(4));
                str.append(" = ");
                str.append(sum / 5);
                str.append("\n");
            } else if ((i + 1) == 31) {
                str.append(" Average weekly price for ");
                str.append(getMonthNameFromInt(7));
                str.append(" = ");
                str.append(sum / 5);
                str.append("\n");
            } else if ((i + 1) == 40) {
                str.append(" Average weekly price for ");
                str.append(getMonthNameFromInt(8));
                str.append(" = ");
                str.append(sum / 5);
                str.append("\n");
            }
            /*

             */
            /*
            // when we hit an (index + 1) that is divisible by 4
            // we create the average and reset sum to 0,
            // and append all the data to a StringBuilder object.
            if ((i+1) % 4 == 0) {
                average = sum / 4;
                sum = 0;
                str.append(" Average weekly price for ");
                str.append(getMonthNameFromInt(i  / 4));
               // str.append(getMonthNameFromInt(i));
                str.append(" = ");
                str.append(average);
                str.append("\n");


            }

             */
        }
        return str.toString();
    }

    public String getHighest() {
        // get the highest value within yearPrices array.
        double highestValueOfYearPrices =
                ArrayOperations.getHighest(yearPrices);

        // get the index of the highest value in yearPrices array.
        int indexOfHighestValue =
                IntStream.range(0, yearPrices.length)
                        .filter(i -> highestValueOfYearPrices == yearPrices[i])
                        .findFirst()
                        .orElse(-1);

        // based on the index of the highest value, we can determine
        // which month and week of that month the highest price occurred.
        StringBuilder str = new StringBuilder();
        str.append(" Highest average weekly price = ");
        str.append(highestValueOfYearPrices + "\n");
        str.append(" Month = ");
        str.append(getMonthNameFromInt((indexOfHighestValue / 4)) + "\n");
        str.append(" Week number = ");
        str.append((indexOfHighestValue % 4) + 1);

        return str.toString();
    }

    public String getLowest() {
        // get the lowest value within yearPrices array.
        double lowestValueOfYearPrices =
                ArrayOperations.getLowest(yearPrices);

        // get the index of the lowest value in yearPrices array.
        int indexOfLowestValue =
                IntStream.range(0, yearPrices.length)
                        .filter(i -> lowestValueOfYearPrices == yearPrices[i])
                        .findFirst()
                        .orElse(-1);

        // based on the index of the lowest value, we can determine
        // which month and week of that month the lowest price occurred.
        StringBuilder str = new StringBuilder();
        str.append(" Lowest average weekly price = ");
        str.append(lowestValueOfYearPrices + "\n");
        str.append(" Month = ");
        str.append(getMonthNameFromInt((indexOfLowestValue / 4)) + "\n");
        str.append(" Week number = ");
        str.append((indexOfLowestValue % 4) + 1);

        return str.toString();
    }

    public String getMonthNameFromInt(int month) {
        DateFormatSymbols monthFormatter = new DateFormatSymbols();
        return monthFormatter.getMonths()[month];
    }

    public void inputGasPrices() throws IOException {
        Scanner inFile =
                HelpfulMethodsForFileIO.returnScannerToReadFromSpecifiedFile(
                        "chapterSpecificFiles/chapter7/1994_Weekly_Gas_Averages"
                );

        for (int i = 0; i < yearPrices.length; i++) {
            yearPrices[i] = inFile.nextDouble();
        }


        for (int i = 0; i < yearPrices.length; i++) {
            System.out.println(yearPrices[i]);
        };

    }


    public int getIndicesNeeded() throws IOException {
        int lines = 0;
        Scanner inFile =
                HelpfulMethodsForFileIO.returnScannerToReadFromSpecifiedFile(
                        "chapterSpecificFiles/chapter7/1994_Weekly_Gas_Averages"
                );

        while (inFile.hasNextLine()) {
            inFile.nextLine();
            lines++;
        }
        return lines;
    }
}
