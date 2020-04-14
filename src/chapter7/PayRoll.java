package chapter7;

import chapter2.AskUserForInput;
import chapter5.HelpfulMethodsForFileIO;

import java.io.IOException;
import java.util.Scanner;

public class PayRoll {
    private int[] employeeId;
    private int[] hours;
    private double[] payRate;
    private double[] wages;


    public PayRoll() throws IOException {
        reserveMemoryForEmployeeIdNumsArray();
        inputEmployeeIdNums();
        inputHours();
        inputPayRates();
        storeWages();
        System.out.println(toString());
    }

    public void reserveMemoryForEmployeeIdNumsArray() throws IOException {
        final int ARRAY_SIZE = countIndicesNeeded();
        employeeId = new int[ARRAY_SIZE];
    }

    public void inputEmployeeIdNums() throws IOException {
        Scanner inFile = HelpfulMethodsForFileIO.
                returnScannerToReadFromSpecifiedFile(
                        "chapterSpecificFiles/chapter7/employeeIdNums");
        for (int i = 0; i < employeeId.length; i++) {
            employeeId[i] = inFile.nextInt();
        }
    }

    public int countIndicesNeeded() throws IOException {
        int count = 0;
        int consumedLine = 0;
        Scanner inFile = HelpfulMethodsForFileIO.
                returnScannerToReadFromSpecifiedFile(
                        "chapterSpecificFiles/chapter7/employeeIdNums");

        while (inFile.hasNextInt()) {
            consumedLine = inFile.nextInt();
            count++;
        }

        inFile.close();
        return count;
    }

    public void inputHours() {
        hours = new int[employeeId.length];

        for (int i = 0; i < hours.length; i++) {
            hours[i] = AskUserForInput.askUserForPositiveInteger(
                    "Enter hours worked for employee " +
                            employeeId[i] + ": "
            );
        }
    }

    public void inputPayRates() {
        payRate = new double[employeeId.length];

        for (int i = 0; i < hours.length; i++) {
            payRate[i] = AskUserForInput.askUserForDouble(
                    6.00,
                    "Enter hourly wage for employee " +
                            employeeId[i] + ": "
            );
        }
    }

    public void storeWages() {
        wages = new double[employeeId.length];

        for (int i = 0; i < wages.length; i++) {
            wages[i] = ( hours[i] * payRate[i] );
        }
    }

    public double getGrossWage(int employeeIdNum) {
        int index = 0;
        double wageIndex = 0;

        do {
            index = getIndexOfEmployeeId(employeeIdNum);

            if (index != -1) {
                wageIndex = wages[index];
            } else {
                System.out.println("The input does not match any index in the array.");
            }
        } while (index == -1);

        return wageIndex;
    }

    public int getIndexOfEmployeeId(int anInt) {
        for (int i = 0; i < employeeId.length; i++) {
            if (employeeId[i] == anInt) {
                return i;
            }
        }

        return -1;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < employeeId.length; i++) {
            str.append("Employee ");
            str.append(employeeId[i]);
            str.append(" total wages = ");
            str.append(getGrossWage(employeeId[i]) + "\n");
        }
        return str.toString();
    }

}
