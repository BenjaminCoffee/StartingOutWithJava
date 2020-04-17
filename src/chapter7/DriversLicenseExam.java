package chapter7;

import chapter2.AskUserForInput;
import chapter5.HelpfulMethodsForFileIO;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DriversLicenseExam {
    private char[] correctAnswers;
    private char[] studentAnswers;

    public DriversLicenseExam() throws IOException {
        inputAnswersFromTheString();

        for (int i = 0; i < correctAnswers.length; i++) {
            System.out.print(correctAnswers[i] + " ");
        }
        System.out.println();
        collectAnswers();

        for (int i = 0; i < studentAnswers.length; i++) {
            System.out.print(studentAnswers[i] + " ");
        }
        System.out.println();
        System.out.println("questions answered correctly = " + amountCorrect());
        System.out.println("questions missed = " + amountIncorrect());
        System.out.print("You missed the following questions: ");
        displayQuestionsMissed();
        System.out.println();
        passOrFail(passed());
    }

    public void displayQuestionsMissed() {
        int[] incorrectArray = questionsMissed();
        for (int i = 0; i < incorrectArray.length; i++) {
            System.out.print(incorrectArray[i] + " ");
        }
    }
    public int[] questionsMissed() {
        int arraySize = amountIncorrect();
        int index = 0;
        int[] incorrectArray = new int[arraySize];
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i] != studentAnswers[i]) {
                incorrectArray[index] = i + 1;
                index++;
            }
        }
        return incorrectArray;
    }

    public int amountIncorrect() {
        int amountIncorrect = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i] != studentAnswers[i]) {
                amountIncorrect++;
            }
        }
        return amountIncorrect;
    }
    public int amountCorrect() {
        int amountCorrect = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i] == studentAnswers[i]) {
                amountCorrect++;
            }
        }
        return amountCorrect;
    }

    public void passOrFail(boolean aBool) {
        if (aBool) {
            System.out.println("You passed!");
        } else System.out.println("You failed.");
    }

    public boolean passed() {
        int amountCorrect = amountCorrect();

        if (amountCorrect >= correctAnswers.length * .75) {
            return true;
        }
        return false;
    }
    public void inputAnswersFromTheString() throws IOException {
        String str = grabTheAnswers();

        // sort the correct answers in the correct order to a String array list.
        List<String> collect =
                Pattern.compile("(\\d+)\\.(.)").matcher(str).results().
                        sorted(Comparator.comparing(m -> Integer.parseInt(m.group(1)))).map
                        (m -> m.group(2)).collect(Collectors.toList());
        correctAnswers = new char[collect.size()];

        // parse the contents of the array list to our primitive char array field.
        for (int i = 0; i < correctAnswers.length; i++) {
            correctAnswers[i] = collect.get(i).charAt(0);
        }

    }

    public void collectAnswers() {
        studentAnswers = new char[correctAnswers.length];

        for (int i = 0; i < studentAnswers.length; i++) {
            studentAnswers[i] = 'A';//returnValidatedAnswer();
        }
    }

    public char returnValidatedAnswer() {
        char userAnswer;
        do {
            userAnswer = askUserForAnswer();
            if (userAnswer != 'A'
                    &&
                    userAnswer != 'B'
                    &&
                    userAnswer != 'C'
                    &&
                    userAnswer != 'D') {
                System.out.println("Your input was invalid.");
            }
        }while(userAnswer != 'A'
                &&
                userAnswer != 'B'
                &&
                userAnswer != 'C'
                &&
                userAnswer != 'D');
        return userAnswer;
    }

    public char askUserForAnswer() {
        return AskUserForInput.askUserForChar(
                "Enter A, B, C, or D"
        );
    }

    public String grabTheAnswers() throws IOException {
        StringBuilder str = new StringBuilder();
        Scanner inFile = HelpfulMethodsForFileIO
                .returnScannerToReadFromSpecifiedFile(
                        "chapterSpecificFiles/chapter7/dLExamAnswers"
                );

        while (inFile.hasNext()) {
            str.append(inFile.next());
        }

        return str.toString();
    }

}
