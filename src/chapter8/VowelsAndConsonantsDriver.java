package chapter8;

import chapter2.AskUserForInput;

import java.util.Scanner;

public class VowelsAndConsonantsDriver {
    private static VowelsAndConsonants vAndC;

    public static void main(String[] args) {
        demonstration();
    }

    public static void demonstration() {
        int userInput = 0;
        do {
            vAndC = getUserAnswerAndPassToNewObject();
            System.out.println(menu());
            userInput = receiveUserSelection();

            do {
                if (userInput != 4 && userInput != 5) {
                    System.out.println("You selected " + userInput);
                    handleUserSelection(userInput);
                    userPressEnter();
                    System.out.println(menu());
                    userInput = receiveUserSelection();
                }
            } while (userInput != 4 && userInput != 5);

            System.out.println("You selected " + userInput);
            userPressEnter();

        } while (userInput != 5);

        System.out.println("Press enter to terminate the program.");
        userPressEnter();
    }

    public static void userPressEnter() {
        Scanner in = new Scanner(System.in);
        System.out.println("Press enter to continue");
        in.nextLine();
    }

    public static void handleUserSelection(int userSelection) {
        Scanner kybd = new Scanner(System.in);
        switch (userSelection) {
            case 1:
                System.out.print("The number of vowels = ");
                System.out.println(vAndC.getNumberOfVowels());
                break;
            case 2:
                System.out.print("The number of consonants = ");
                System.out.println(vAndC.getNumberOfConsonants());
                break;
            case 3:
                System.out.print("The number of both vowels and consonants = ");
                System.out.println(vAndC.getVowelsAndConsonants());
                break;
            case 4:
            case 5:
                break;
        }
    }

    public static String menu() {
        return "Please select from the following:\n" +
                "1. Count the number of vowels in the string.\n" +
                "2. Count the number of consonants in the string.\n" +
                "3. Count both the vowels and consonants in the string.\n" +
                "4. Enter another string.\n" +
                "5. Exit the program.";
    }

    public static int receiveUserSelection() {
        int userInput = 0;
        do {
            userInput = AskUserForInput.askUserForInteger(
                    "Enter 1 - 5"
            );
            if (userInput < 1 || userInput > 5) {
                System.out.println("invalid range, please try again.");
            }
        } while (userInput < 1 || userInput > 5);

        return userInput;
    }

    public static VowelsAndConsonants getUserAnswerAndPassToNewObject() {
        String userAnswer = VowelsAndConsonants.getStringFromUser();
        return new VowelsAndConsonants(userAnswer);
    }
}
