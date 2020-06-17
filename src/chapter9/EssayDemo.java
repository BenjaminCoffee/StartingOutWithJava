package chapter9;

import chapter2.AskUserForInput;

public class EssayDemo {
    public static void main(String[] args) {
        demonstration();
    }

    public static void demonstration() {
        Essay essay =
                new Essay(askForGrammar(),
                        askForSpelling(),
                        askForLength(),
                        askForContent());
        System.out.println(essay.getGrade());
    }

    /*
    public static double calculateAndReturnTotalEssayPoints() {
        double total = askForGrammar() +
                askForSpelling() +
                askForLength() +
                askForContent();

        return total;
    }

     */
    public static double askForGrammar() {
        return AskUserForInput.askUserForPositiveDouble(
                "Enter points for grammar: ");
    }

    public static double askForSpelling() {
        return AskUserForInput.askUserForPositiveDouble(
                "Enter points for spelling: ");
    }

    public static double askForLength() {
        return AskUserForInput.askUserForPositiveDouble(
                "Enter points for length: ");
    }

    public static double askForContent() {
        return AskUserForInput.askUserForPositiveDouble(
                "Enter points for content: ");
    }

}
