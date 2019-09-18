package Chapter4;

import Chapter2.AskUserForInput;

public class RomanNumerals {
    int number;

    public RomanNumerals() {
        validateInput();
    }
    public void validateInput() {
        int input = receiveUserInput();

        if(input > 0 && input <= 10) {
            setNumber(input);
        }
        else System.out.println("You did not enter a number between 1 and 10.");
    }
    public int receiveUserInput () {
        return AskUserForInput.askUserForInteger(promptForNumInput());
    }
    public String promptForNumInput () {
        return "Please enter a number between 1 and 10, inclusive.";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
