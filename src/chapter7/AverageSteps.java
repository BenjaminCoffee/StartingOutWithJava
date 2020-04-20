package chapter7;

import chapter5.HelpfulMethodsForFileIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class AverageSteps {
    private int[][] year;
    public AverageSteps() throws IOException {
        createSampleDataFile();
        inputYear();
        System.out.println(calculateMonthlyAverages());
    }

    public String calculateMonthlyAverages() throws IOException {
        int days = getNumOfDays();
        int months = 12;
        int daysPerMonth = days / months;

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < months; i++) {
            str.append(" Average daily steps in ");
            str.append(returnMonthFromInt(i));
            str.append(" = ");
            int sum = 0;

            for (int j = 0; j < daysPerMonth ; j++) {
                sum = sum + year[i][j];
            }
            str.append(String.format("%.2f", Double.valueOf(sum) / Double.valueOf(30) ));
            str.append("\n");
        }

        return str.toString();
    }

    public String returnMonthFromInt(int month) {
        DateFormatSymbols dateFormatter = new DateFormatSymbols();
        return dateFormatter.getMonths()[month];
    }

    public void inputYear() throws IOException {
        int days = getNumOfDays();
        int months = 12;
        int daysPerMonth = days / months;
        // months = 12
        // days = 30;
        year = new int[months][daysPerMonth];
        Scanner inFile = HelpfulMethodsForFileIO.returnScannerToReadFromSpecifiedFile(
                "chapterSpecificFiles/chapter7/steps"
        );

        for (int i = 0; i < months; i++) {
            for (int j = 0; j < daysPerMonth; j++) {
                year[i][j] = inFile.nextInt();
            }
        }
    }
    public int getNumOfDays() throws IOException {
        int days = 0;
        Scanner inFile = HelpfulMethodsForFileIO.returnScannerToReadFromSpecifiedFile(
                "chapterSpecificFiles/chapter7/steps"
        );
        while (inFile.hasNextLine()) {
            inFile.nextLine();
            days++;
        }

        inFile.close();
        return days;
    }

    // Could not find the sample data file from the companion website
    // so I made my own.
    public void createSampleDataFile() throws IOException {
        PrintWriter toFile = HelpfulMethodsForFileIO.createNewFileAndWriteToIt(
                "chapterSpecificFiles/chapter7",
                "steps"
        );
        for (int i = 0; i < 365; i++) {
            Random random = new Random();
            toFile.println(random.nextInt(1001));
        }
        toFile.close();
    }
}
