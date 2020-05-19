package chapter8;

import chapter2.AskUserForInput;

public class MorseCodeConverterDriver {
    public static void main(String[] args) {
        String userInput = AskUserForInput.askUserForString(
                "Please enter a string to be converted to moresCode: "
        );
        MorseCodeConverter morseCodeConverter =
                new MorseCodeConverter(userInput);
        System.out.println(morseCodeConverter.calculateOutput());
    }
}
