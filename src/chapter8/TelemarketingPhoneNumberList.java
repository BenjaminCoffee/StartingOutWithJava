package chapter8;

import chapter5.HelpfulMethodsForFileIO;

import java.io.IOException;
import java.util.Scanner;

public class TelemarketingPhoneNumberList {
    private String[][] customerData;
    private String results;

    public TelemarketingPhoneNumberList() throws IOException {
        getCustomerDataFromFile();
    }

    public void getCustomerDataFromFile() throws IOException {
        int totalNames = countNames();
        int fileLine = 0;
        customerData = new String[2][totalNames];

        Scanner inFile =
                HelpfulMethodsForFileIO.returnScannerToReadFromSpecifiedFile(
                        "chapterSpecificFiles/chapter8/telemarketingSampleData.txt"
                );
        while (fileLine < totalNames) {
            customerData[0][fileLine] = inFile.nextLine();
            fileLine++;
        }

        fileLine = 0;

        while (fileLine < totalNames) {
            customerData[1][fileLine] = inFile.nextLine();
            fileLine++;
        }
    }

    public int countNames() throws IOException {
        int names = 0;
        Scanner inFile =
                HelpfulMethodsForFileIO.returnScannerToReadFromSpecifiedFile(
                        "chapterSpecificFiles/chapter8/telemarketingSampleData.txt"
                );
        while (inFile.hasNextLine() &&
                Character.isAlphabetic(inFile.nextLine().charAt(0))) {
            names++;
        }
        return names;
    }

    public void storeResults(String name) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < customerData[0].length; i++) {
            if (customerData[0][i].toUpperCase().startsWith(name.toUpperCase())) {
                str.append(customerData[0][i] + ": " + customerData[1][i] + "\n");
            }
        }
        results = str.toString();
    }

    public String getResults() {
        return results;
    }
}
