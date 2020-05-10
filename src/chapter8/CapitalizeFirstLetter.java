package chapter8;

import java.util.StringTokenizer;

public class CapitalizeFirstLetter {
    private String string;

    public CapitalizeFirstLetter(String string) {
        capitalizeFirstLetter(string);
    }
    public void capitalizeFirstLetter(String string) {
        char upCase;
        int index = 1;
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(string.toUpperCase().charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == '.' &&
                    Character.isWhitespace(string.charAt(i + 1))) {
                upCase = string.toUpperCase().charAt(i + 2);
                strBuilder.append(string.charAt(i));
                strBuilder.append(string.charAt(i + 1));
                strBuilder.append(upCase);
                i = i + 2;
            } else {
                strBuilder.append(string.charAt(i));
            }
        }
        this.string = strBuilder.toString();

    }

    public String getString() {
        return string;
    }
}
