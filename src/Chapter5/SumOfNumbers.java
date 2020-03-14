package chapter5;

import chapter2.AskUserForInput;

/**
 * This class asks the user for an integer and ensures the number is
 * a valid number(non-zero and positive).
 * Then the program sums all integers between 1 and the
 * number entered by the user.
 */
public class SumOfNumbers {
    public SumOfNumbers() {
        System.out.println(statement());
    }
    public String statement() {
        return "The sum of all integers between 1" +
                " and the number you entered = "+
                sumTheNumbers();
    }
    public int sumTheNumbers() {
        int sum = 0;
        int limit = returnValidNumber();

        for (int i = 0; i <= limit; i++) {
            sum = sum + i;
        }
         return sum;
    }

    public int returnValidNumber() {
        int x;
        do {
            x = askForAndReturnTheNumber();
            if (x <= 0) {
                System.out.println("You did not enter a positive number.");
            }
        } while (x <= 0);
        return x;
    }
    public int askForAndReturnTheNumber() {
        return
                AskUserForInput.askUserForInteger("Please Enter a positive," +
                        " non-zero number.");
    }
}
