package Chapter5;

import Chapter2.AskUserForInput;

public class GreatestAndLeast {

    public void theLoop() {
        int num;
        int least = 0;
        int greatest = 0;

        do {
            num = askForANumber();
            if(num < least && num != -99) {
                least = num;
            }
            if(num > greatest && num != -99) {
                greatest = num;
            }

        } while (num != -99);
        System.out.println(" You have entered -99 to stop the loop.");
        System.out.print("The smallest integer entered = ");
        System.out.println(least);
        System.out.print("The greatest integer entered = ");
        System.out.println(greatest);
    }
    public int askForANumber() {
        return AskUserForInput.askUserForInteger(
                "Enter any integer, enter -99 to stop: "
        );
    }
}
