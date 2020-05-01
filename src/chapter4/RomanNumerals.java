package chapter4;

import chapter2.AskUserForInput;

public class RomanNumerals {
    int number;

    public RomanNumerals() {
        validateInput();
    }
    public String returnRoman() {
        return convertToRoman(getNumber());
    }
    public String convertToRoman(int anInt) {
        switch (anInt){
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
        }
        return "Error";
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
