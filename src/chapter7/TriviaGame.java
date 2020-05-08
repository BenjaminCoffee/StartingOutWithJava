package chapter7;

import chapter5.HelpfulMethodsForFileIO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class TriviaGame {
    private ArrayList<Question> questions = new ArrayList<>();
    private Player player1;
    private Player player2;


    public TriviaGame() throws IOException {
        createPlayers();
        inputQuestionsAndAnswers();
        theLoop();
        checkWinner(player1, player2);
    }

    public void checkWinner(Player player1, Player player2) {
        if (player1.getScore() == player2.getScore()) {
            System.out.println("Draw");
        } else if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getPlayerIdentifier().toString().toLowerCase()
                    + " has won.");
        } else {
            System.out.println(player2.getPlayerIdentifier().toString().toLowerCase()
                    + " has won.");
        }
    }

    public void theLoop() {
        int correctChoice;
        String correctAnswer;
        String question;
        System.out.println(player1.getPlayerIdentifier().toString().toLowerCase() +
                ", it is your turn...\n");
        for (int i = 0; i < questions.size(); i++) {
            String[] answers = new String[4];

            // the questions of the first question object is parsed
            // in to the first index of this first string array;
            question = questions.get(i).getQuestion();

            // The pattern of the triviaGameQuestions file lists the correct answer as the
            // first possible answer for all questions.
            // we will copy this correct answer and store it for later use in this method.
            answers[0] = questions.get(i).getPossibleAnswer1();
            correctAnswer = answers[0];

            // copy the rest of the possible answers to the 3 remaining indices
            // of the string array.
            answers[1] = questions.get(i).getPossibleAnswer2();
            answers[2] = questions.get(i).getPossibleAnswer3();
            answers[3] = questions.get(i).getPossibleAnswer4();

            //randomize the string array of possible answers
            shuffleArray(answers);
            // identify the integer that will represent the correct choice.
            // we will use this integer to match the input from the user
            // if they match, the user chose the correct answer.
            correctChoice = whichIndexContainsCorrectAnswer(answers, correctAnswer) + 1;
            System.out.println();
            if (i == (questions.size() / 2) ) {
                System.out.println(player2.getPlayerIdentifier().toString().toLowerCase() +
                        ", it is your turn...");
            }
            System.out.println(displayAnswerAndChoices(answers, question));
            if (i >= (questions.size() / 2) ) {
                allowPlayerTurn(correctChoice, player2);
            }
            else {
                allowPlayerTurn(correctChoice, player1);
            }
            System.out.println("Player 1 score = " + player1.getScore());
            System.out.println("Player 2 score = " + player2.getScore());
        }
    }

    public void inputQuestionsAndAnswers() throws IOException {
        Scanner inFile =
                HelpfulMethodsForFileIO.returnScannerToReadFromSpecifiedFile(
                        "chapterSpecificFiles/chapter7/triviaGameQuestions"
                );
        while (inFile.hasNextLine()) {
            // grab the question
            // and answers and put them in a new question object
            Question currentQuestion = new Question();

            String line = inFile.nextLine();
            currentQuestion.setQuestion(line);

            line = inFile.nextLine();
            currentQuestion.setPossibleAnswer1(line);
            // the right answer will always be the first possible answer
            currentQuestion.setCorrectAnswer(currentQuestion.getPossibleAnswer1());

            line = inFile.nextLine();
            currentQuestion.setPossibleAnswer2(line);

            line = inFile.nextLine();
            currentQuestion.setPossibleAnswer3(line);

            line = inFile.nextLine();
            currentQuestion.setPossibleAnswer4(line);

            // add question object to questions ArrayList
            questions.add(currentQuestion);
        }

        inFile.close();
    }

    public void createPlayers() {
        player1 = new Player();
        player2 = new Player();
        player1.setPlayerIdentifier(Player.playerIdentity.PLAYER1);
        player2.setPlayerIdentifier(Player.playerIdentity.PLAYER2);
    }

    public String displayAnswerAndChoices(String[] answerArr, String theQuestion) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < answerArr.length; i++) {
            if (i % 5 == 0) {
                str.append(theQuestion + "\n");
            }
            str.append((i + 1) + ". " + answerArr[i] + "\n");
        }
        return str.toString();
    }

    public void allowPlayerTurn(int correctChoice, Player player) {
        int choice = player.makeGuess();
        if (choice == correctChoice) {
            player.setScore(player.getScore() + 1);
        }
    }

    public int whichIndexContainsCorrectAnswer(String arr[], String t) {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i].equalsIgnoreCase(t)) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    public void shuffleArray(String[] ar) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

}

