package chapter8;

public class MorseCodeConverter {
    private String input;
    private static String[][] stringLibrary = {
            {" ", ",", ".", "?", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
                    "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},

            {" ", "--..--", ".-.-.-", "..--..", "-----", ".----", "..---", "...--", "....-",
                    ".....", "-....", "--...", "---..", "----.", ".-", "-...", "-.-.", "-..", ".",
                    "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                    "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."}
    };

    public String calculateOutput() {
        StringBuilder str = new StringBuilder();
        String upperCaseVersion = input.toUpperCase();
        String[] inputArray = upperCaseVersion.split("");

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < stringLibrary[0].length; j++) {
                if (inputArray[i].equals(stringLibrary[0][j])) {
                    str.append(stringLibrary[1][j]);
                }
            }
        }

        return str.toString();
    }

    public String[][] getCharLibrary() {
        return stringLibrary;
    }

    public MorseCodeConverter(String input) {
        this.input = input;
    }
}
