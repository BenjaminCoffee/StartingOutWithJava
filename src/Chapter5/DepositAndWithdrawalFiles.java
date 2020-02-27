package Chapter5;

import java.io.IOException;
import java.util.Scanner;

public class DepositAndWithdrawalFiles {
    public static void accountDemo() throws IOException {
        SavingsAccount account0 = new SavingsAccount(500);

        // set the anual interest rate field
        account0.setAnnualInterestRate(.02);

        // create a scanner equipped to read from the specified file.
        Scanner inFile =
                HelpfulMethodsForFileIO.returnScannerToReadFromSpecifiedFile(
                        "C:\\Users\\benja\\IdeaProjects\\StartingOutWithJava" +
                                "\\TextFiles\\Chapter5\\deposits.txt"
                );

        // read data from the specified file.
        while (inFile.hasNextLine()) {
            account0.deposit(inFile.nextDouble());
        }


        System.out.println(account0.getBalance());

        // assign the scanner to read from a different file,
        // 'withdrawals.txt'.
        inFile =
                HelpfulMethodsForFileIO.returnScannerToReadFromSpecifiedFile(
                        "C:\\Users\\benja\\IdeaProjects\\StartingOutWithJava" +
                                "\\TextFiles\\Chapter5\\withdrawals.txt"
                );

        // read in data from 'withdrawals.txt'
        while (inFile.hasNextLine()) {
            account0.withdraw(inFile.nextDouble());
        }

        // add the monthly interest to the balance.
        account0.addMonthlyInterest();

        System.out.println(account0.getBalance());

    }
}
