package Chapter4;

import Chapter2.AskUserForInput;

public class RoulettePocket {
    private int number;

    RoulettePocket(int number) {
        this.number = number;
    }

    //region Static methods used for user input
    public static int inputNumber() {
        return returnUserInput();
    }

    public static int returnUserInput() {
        int userInput;

        do {
            userInput = AskUserForInput.askUserForInteger(
                    "Enter a number between 0-36: "
            );
            if (userInput < 0 || userInput > 36) {
                System.out.println("That number is not between 0-36");
            }
        } while (userInput < 0 || userInput > 36);

        return userInput;
    }
    //endregion


    public String getPocketColor(int num) {

        if (num == 0) {
            return returnGreen();
        }
        if (num >= 1 && num <= 10) {
            if (num % 2 == 0) {
                return returnBlack();
            } else return returnRed();
        }
        if (num > 10 && num <= 18) {
            if (num % 2 == 0) {
                return returnRed();
            } else return returnBlack();
        }
        if (num > 18 && num <= 28) {
            if (num % 2 == 0) {
                return returnBlack();
            } else return returnRed();
        }
        if (num > 28 && num <= 36) {
            if (num % 2 == 0) {
                return returnRed();
            } else return returnBlack();
        } else return "There was an error during user input. The number is invalid.";
    }

    public String returnBlack() {
        return "Black";
    }
    public String returnRed() {
        return "Red";
    }
    public String returnGreen() {
        return "Green";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}