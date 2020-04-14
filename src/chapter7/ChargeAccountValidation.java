package chapter7;

import chapter2.AskUserForInput;
import chapter5.HelpfulMethodsForFileIO;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ChargeAccountValidation {
    private int[] accountNumbers;

    public ChargeAccountValidation() throws IOException {
        boolean continuing = false;
        do {
            int userInputForAccountNumber = returnUserEnteredNumber();
            inputAccountNumbers();

            // the numbers in the array are sorted in ascending order.
            // now we can use a binary search on them.
            Arrays.sort(accountNumbers);
            if (isValid(userInputForAccountNumber)) {
                System.out.println("The account number is valid");
            }
            else System.out.println("The account number is invalid.");

            continuing = AskUserForInput.askUserYesOrNo(
                    "Do you want to enter another number?"
            );
            if (!continuing) {
                System.out.println("Thank you for using the program.");
                System.out.println("Pressing 'enter' will now quit.");
                Scanner kybd = new Scanner(System.in);
                kybd.nextLine();
            }
        }while(continuing);

    }

    public int returnUserEnteredNumber() {
        return AskUserForInput.askUserForPositiveInteger(
                "Please enter the account number: "
        );
    }

    // iterative binary search
    public boolean isValid(int accountNumber) {
        int l = 0;
        int r = accountNumbers.length - 1;

        while (l <= r) {
            int middle = l + (r - l) / 2;

            if (accountNumbers[middle] == accountNumber) {
                return true;
            }
            if (accountNumbers[middle] < accountNumber) {
                l = middle + 1;
            }
            else {
                r = middle - 1;
            }
        }

        return false;
    }


    public void inputAccountNumbers() throws IOException {
        final int ARRAY_SIZE = countIndicesNeeded();
        accountNumbers = new int[ARRAY_SIZE];
        Scanner inFile =
                HelpfulMethodsForFileIO.returnScannerToReadFromSpecifiedFile(
                        "chapterSpecificFiles/chapter7/chargeAccountNumbers"
                );
        for (int i = 0; i < accountNumbers.length; i++) {
            accountNumbers[i] = inFile.nextInt();
        }
        inFile.close();;
    }

    public int countIndicesNeeded() throws IOException {
        int count = 0;
        int consumedInt = 0;
        Scanner inFile =
                HelpfulMethodsForFileIO.returnScannerToReadFromSpecifiedFile(
                        "chapterSpecificFiles/chapter7/chargeAccountNumbers"
                );
        while (inFile.hasNextInt()) {
            count++;
            consumedInt = inFile.nextInt();
        }
        inFile.close();
        return count;
    }
}
