package chapter8;

import chapter2.AskUserForInput;

public class VowelsAndConsonants {
    private String string;
    private int userSelection;

    public VowelsAndConsonants(String string) {
        this.string = string;
    }

    public int getVowelsAndConsonants() {
        int numOfVowels = getNumberOfVowels();
        int numOfConsonants = getNumberOfConsonants();

        return numOfVowels + numOfConsonants;
    }

    public int getNumberOfConsonants() {
        int numOfConsonants = 0;
        String localParameterString = this.string;
        for (int i = 0; i < this.string.length(); i++) {
            if (Character.isAlphabetic(localParameterString.charAt(i))
                    &&
                    !isVowel(localParameterString.charAt(i))) {
                numOfConsonants++;
            }
        }
        return numOfConsonants;
    }

    private boolean isVowel(char character) {
        switch (Character.toUpperCase(character)) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
        }
        return false;
    }

    public int getNumberOfVowels() {
        int numOfVowels = 0;
        String localString = this.string;
        for (int i = 0; i < this.string.length(); i++) {
            switch (localString.toUpperCase().charAt(i)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    numOfVowels++;
                    break;
            }
        }
        return numOfVowels;
    }

    public static String getStringFromUser() {
        return AskUserForInput.askUserForString(
                "Please enter a string: "
        );
    }
}
