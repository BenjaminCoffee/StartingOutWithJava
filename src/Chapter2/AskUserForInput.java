package Chapter2;

import java.util.Scanner;

public class AskUserForInput {

    public static char askUserForChar(String userPrompt) {
        char aChar;
        String input;

        // FYI: `do while` loops are good to know, but in my experience not used very often
        do {
            aChar = askForChar(userPrompt);
            input = confirmationForChar(aChar);
        } while (input.equalsIgnoreCase("N"));
        System.out.println("Thank you!");

        return aChar;
    }

    public static String confirmationForChar(char x) {
        Scanner in = new Scanner(System.in);
        String input;

        do {
            System.out.println("You entered '"+x+"'");
            System.out.println("Press 'Y' to confirm or 'N' ro re-enter.");
            input = in.nextLine();
        } while (input.isBlank() || // `isBlank` Returns true if the string is empty or contains only white space codepoints. Therefore you don't need to also have `isEmpty`
                (!(input.equalsIgnoreCase("Y")) &&
                        !(input.equalsIgnoreCase("N"))));

        return input;
    }

    public static char askForChar(String userPrompt) {
        String aString;
        char aChar;

        Scanner in = new Scanner(System.in);

        do {
            prompt(userPrompt);
            aString = in.nextLine();
            aString = aString.toUpperCase();
            aChar = aString.charAt(0);
            if (aString.isBlank()) // `isBlank` Returns true if the string is empty or contains only white space codepoints. Therefore you don't need to also have `isEmpty`
                System.out.println("You did not enter anything...");
        } while (aString.isBlank());

        return aChar;
    }

    /**
     * This method will take input from the user.
     * The method restricts the user to answering either yes or no.
     * the method will return true for an answer of yes or
     * false for an answer of no.
     * @return A boolean, true or false.
     */
    public static boolean askUserYesOrNo(String yesOrNoQuestion) {
        String answer;

        do {
            System.out.println(yesOrNoQuestion);
            answer = askForString("Enter 'y' for yes or 'n' for no.");
            if (!answer.equalsIgnoreCase("y") &&
                    !answer.equalsIgnoreCase("n")) {
                System.out.println("You did not enter 'y' or 'n'");
            }
        } while (!answer.equalsIgnoreCase("y") &&
                !answer.equalsIgnoreCase("n"));

        // No need for `if/else` statements to return boolean value when the returning the value of `equalsIgnoreCase` already does that for you
        return answer.equalsIgnoreCase("y");
    }

    /**
     * This method wraps the askForString and confirmationForString methods
     * in a do while loop.
     * The user has the option to re-enter data if they are not satisfied
     * with the previous input by pressing "N".
     * Only when the user is satisfied with the input will the method return
     * the user's String.
     * @param userPrompt - A String, the prompt to the user.
     * @return aString, the String entered by the user.
     */
    public static String askUserForString(String userPrompt) {
        String aString;
        String input;

        do {
            aString = askForString(userPrompt);
            input = confirmationForString(aString);
        } while (input.equalsIgnoreCase("N"));
        System.out.println("Thank you!");

        return aString;
    }

    /**
     * This method is designed to receive the String returned from the
     * askForString method.
     * The user is asked to verify the string input.
     * The user selection, either "Y" or "N" is returned as a string.
     * @param x a String, the user input from the askforString method.
     * @return input, a String, the user selection, either "Y" or "N".
     */
    public static String confirmationForString(String x) {
        Scanner in = new Scanner(System.in);
        String input;

        do {
            System.out.println("You entered '"+x+"'");
            System.out.println("Press 'Y' to confirm or 'N' ro re-enter.");
            input = in.nextLine();
        } while(inputInvalid(input));

        return input;
    }

    /**
     * This method receives a string, the prompt to the user.
     * The method is designed to take a String from the user.
     * The method ensures there is something other than white space
     * in the input.
     * The String taken from the user is returned.
     * @param userPrompt - A string, the prompt to the user.
     * @return aString, the String entered by the user.
     */
    public static String askForString(String userPrompt) {
        String aString;
        Scanner in = new Scanner(System.in);
        do {
            prompt(userPrompt);
            aString = in.nextLine();
            if (aString.isBlank()) {
                System.out.println("You did not enter anything...");
            }
        } while (aString.isBlank());

        return aString;
    }

    /**
     * This method wraps the askForDouble and confirmationForDouble
     * methods in a do while loop.
     * The user has the option to re-enter data if they are not satisfied
     * with the previous input by pressing "N".
     * Only when the user is satisfied with the input will the method return
     * the user's floating point number.
     * @param userPrompt - A String, the user prompt to be passed to askForDouble.
     * @return aDouble, the decimal entered by the user.
     */
    public static double askUserForDouble(String userPrompt) {
        String aString;
        double aDouble;

        do {
            aDouble = askForDouble(userPrompt);
            aString = confirmationForDouble(aDouble);
        } while (aString.equalsIgnoreCase("N"));
        System.out.println("Thank you!");

        return aDouble;
    }

    /**
     * This method was designed to receive the double returned from the
     * askForDouble method.
     * The user is asked to verify the double entered.
     * A String, the user's selection is returned, either "Y" or "N".
     * @param x - an integer returned from the askForDouble method.
     * @return a String, the user's selection, either "Y" or "N".
     */
    public static String confirmationForDouble(double x) {
        Scanner in = new Scanner(System.in);
        String input;

        do {
            System.out.println("You entered '"+x+"'");
            System.out.println("Press 'Y' to confirm or 'N' ro re-enter.");
            input = in.nextLine();
        } while (inputInvalid(input));

        return input;
    }

    /**
     * This method receives a String to be displayed as a prompt to the user.
     * The method is designed to take a decimal from the user.
     * The method ensures only a decimal can be entered.
     * The decimal is returned.
     * @param userPrompt - a String, the prompt to the user.
     * @return aDouble, the floating point number entered by the user.
     */
    public static double askForDouble(String userPrompt) {
        double aDouble = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            prompt(userPrompt);
            if (in.hasNextDouble()) {
                aDouble = in.nextDouble();
                break;
            }
            else {
                in.nextLine();
                System.out.println("You did not enter a decimal.");
            }
        }

        return aDouble;
    }

    /**
     * This method wraps the askForInt and confirmationForInt methods
     * in a do while loop.
     * If the user signals a desire to re-enter the integer by pressing "N",
     * the process will loop back to the beginning of the askForInt method.
     * Finally, after user is satisfied with the input integer, it is returned.
     * @param userPrompt - a String, the user prompt to be passed to askForInt
     * @return anInt, the integer entered by the user.
     */
    public static int askUserForInteger(String userPrompt) {
        String aString;
        int anInt;

        do {
            anInt = askForInt(userPrompt);
            aString = confirmationForInt(anInt);
        } while(aString.equalsIgnoreCase("N"));
        System.out.println("Thank you!");

        return anInt;
    }

    /**
     * This method was designed to receive the integer returned from the
     * askForInt method.
     * The user is asked to verify the integer entered.
     * The method returns a String, the user's selection, either "Y" or "N".
     * @param x - The integer returned from askForInt.
     * @return input, a String taken from the user, either "Y" or "N".
     */
    public static String confirmationForInt(int x) {
        Scanner in = new Scanner(System.in);
        String input;

        do {
            System.out.println("You entered '"+x+"'");
            System.out.println("Press 'Y' to confirm or 'N' ro re-enter.");
            input = in.nextLine();
        } while (inputInvalid(input));

        return input;
    }

    /**
     * This method receives a String, the prompt to the user.
     * The method asks for the user to enter an integer.
     * The method ensures that an integer is entered.
     * The integer is then returned.
     * @param userPrompt - a String, the prompt to the user.
     * @return anInt, the integer entered by the user.
     */
    public static int askForInt(String userPrompt) {
        int anInt = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            prompt(userPrompt);
            if (in.hasNextInt()) {
                anInt = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                System.out.println("You did not enter an integer.");
            }
        }
        return anInt;
    }

    /**
     * This static method receives a string. The string is displayed in the console.
     * @param prompt - A string to be passed to the method.
     */
    public static void prompt(String prompt) {
        System.out.println(prompt);
    }

    /**
     * Helper method for determining if input is invalid. Methods like this are convenient because if your logic for
     * determining validity ever changes, you just have to change it here (once) instead of every place you copied it.
     * @return
     */
    public static boolean inputInvalid() {
        return input.isBlank() || (!(input.equalsIgnoreCase("Y")) && !(input.equalsIgnoreCase("N")))
    }

    /*

    public static String grabInput() {
        String str = "";
        Scanner in = new Scanner(System.in);

        str = in.next();

        return str;
    }

    public static boolean stringContainsANum(String aStr) {

        Pattern p = Pattern.compile( "[0-9]" );
        Matcher m = p.matcher( aStr );

        return m.find();
    }


    public static int askForNumber() {
        int x = 0;
        String str;

        //loop will iterate until a string containing a number is entered.
        do {
            prompt("Please enter an integer...");
            str = grabInput();
        }while(str.isEmpty() || str.isBlank() || !stringContainsANum(str));

        //At this point an integer exists inside the string
        //This method will extract the first occurrence of an integer.
        str = str.replaceAll("[^0-9]", "");
        x = Integer.parseInt(str);
        return x;
    }

     */
}
