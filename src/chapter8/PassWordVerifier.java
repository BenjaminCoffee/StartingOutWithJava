package chapter8;

public class PassWordVerifier {
    public static boolean isPasswordValid(String string) {

        if (isLengthValid(string)
                &&
                containsUpperCaseChar(string)
                &&
                containsLowerCaseChar(string)
                &&
                containsDigit(string)) {
            return true;
        }

        return false;
    }

    public static boolean isLengthValid(String string) {
        int validStringLength = 6;
        if (string.length() >= validStringLength) {
            return true;
        }
        return false;
    }

    public static boolean containsUpperCaseChar(String string) {
        boolean flag = false;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isAlphabetic(string.charAt(i))) {
                if (Character.isUpperCase(string.charAt(i))) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static boolean containsLowerCaseChar(String string) {
        boolean flag = false;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isAlphabetic(string.charAt(i))) {
                if (Character.isLowerCase(string.charAt(i))) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static boolean containsDigit(String string) {
        boolean flag = false;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                flag = true;
            }
        }
        return flag;
    }

}
